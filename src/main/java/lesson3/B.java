package lesson3;

import java.util.Random;

/**
 * Created by asv on 08.12.16.
 */
public class B extends A {
    static {
        System.out.println("Hello From Static block B");
    }

    public B() {
        System.out.println("Hello From B");
    }
}
