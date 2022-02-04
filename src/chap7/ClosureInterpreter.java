package chap7;

import stone.ClosureParser;
import chap6.BasicInterpreter;

public class ClosureInterpreter extends BasicInterpreter {
    public static void main(String[] args) {
        try {
            run(new ClosureParser(), new NestedEnv());
        } catch (Exception e) {
            System.out.println("Exception occured: " + e.getMessage());
        }
    }
}
