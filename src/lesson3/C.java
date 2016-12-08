package lesson3;

/**
 * Created by asv on 08.12.16.
 */
public class C extends B {
    static {
        System.out.println("Hello From Static block C");
    }

    public C() {
        System.out.println("Hello From C");
    }

    public static void print() {
        System.out.println("Print from C");
    }
}
