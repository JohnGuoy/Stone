package chap6;

import javassist.gluonj.util.Loader;

public class Runner {
    public static void main(String[] args) throws Throwable {
        try {
            Loader.run(BasicInterpreter.class, args, BasicEvaluator.class);
        } catch (Exception e) {
            System.out.println("Exception occured: " + e.getMessage());
        }
    }
}
