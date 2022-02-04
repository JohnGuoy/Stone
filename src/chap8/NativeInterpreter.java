package chap8;

import stone.ClosureParser;
import chap6.BasicInterpreter;
import chap7.NestedEnv;

public class NativeInterpreter extends BasicInterpreter {
    public static void main(String[] args) {
        try {
            run(new ClosureParser(), new Natives().environment(new NestedEnv()));
        } catch (Exception e) {
            System.out.println("Exception occured: " + e.getMessage());
        }
    }
}
