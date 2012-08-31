package arseneReaction;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 8/31/12
 * Time: 10:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class testStatic {
    private A instanceFieldA;

    public testStatic(A instanceFieldA) {
        this.instanceFieldA = instanceFieldA;
    }

    public static void main(String[] args) {

    }
    static void methodTest(A a) {
        a.toString();
    }

    void  ABC(){
        methodTest(instanceFieldA);
    }
}
