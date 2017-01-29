package lesson3;

import java.util.Random;

/**
 * Created by asv on 08.12.16.
 */
public class A {
    public static int i = 1;
    static {
        System.out.println("Hello From Static block A");
    }

    public A() {
        System.out.println("Hello From A");
    }

    public void printStaticField() {
        System.out.println("static field i = " + i);
    }
}
