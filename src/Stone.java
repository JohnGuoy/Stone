import javassist.gluonj.util.Loader;
import chap7.ClosureEvaluator;
import chap8.NativeEvaluator;
import chap9.ClassEvaluator;
import chap9.ClassInterpreter;
import chap10.ArrayEvaluator;

public class Stone {
    public static void main(String[] args) throws Throwable {
        Loader.run(ClassInterpreter.class, args, ClassEvaluator.class,
                   ArrayEvaluator.class, NativeEvaluator.class,
                   ClosureEvaluator.class);
    }
}
