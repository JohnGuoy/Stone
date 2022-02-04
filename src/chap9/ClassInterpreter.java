package chap9;

import stone.ClassParser;
import chap6.BasicInterpreter;
import chap7.NestedEnv;
import chap8.Natives;

public class ClassInterpreter extends BasicInterpreter {
    public static void main(String[] args) {
        try {
            run(new ClassParser(), new Natives().environment(new NestedEnv()));
        } catch (Exception e) {
            System.out.println("Exception occured: " + e.getMessage());
        }
    }
}
