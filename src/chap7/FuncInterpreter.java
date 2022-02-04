package chap7;

import stone.FuncParser;
import chap6.BasicInterpreter;

public class FuncInterpreter extends BasicInterpreter {
    public static void main(String[] args) {
        try {
            run(new FuncParser(), new NestedEnv());
        } catch (Exception e) {
            System.out.println("Exception occured: " + e.getMessage());
        }
    }
}
