package chap6;

import java.text.ParseException;

import stone.*;
import stone.ast.ASTree;
import stone.ast.NullStmnt;

public class BasicInterpreter {
    public static void main(String[] args) throws ParseException {
        run(new BasicParser(), new BasicEnv());
    }

    public static void run(BasicParser bp, Environment env) {
        Lexer lexer = new Lexer(new CodeDialog());
        try {
            while (lexer.peek(0) != Token.EOF) {
                try {
                    ASTree t = bp.parse(lexer);
                    if (!(t instanceof NullStmnt)) {
                        Object r = ((BasicEvaluator.ASTreeEx) t).eval(env);
                        // System.out.println("=> " + r);
                    }
                } catch (Exception e) {
                    System.out.println("Exception occured: " + e.getMessage());
                    break;
                }
            }
        } catch (ParseException e) {
            System.out.println("ParseException occured: " + e.getMessage());
        }
    }
}
