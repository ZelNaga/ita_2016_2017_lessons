package lesson14;

/**
 * Created by asv on 01.03.17.
 */
public class SomeClass implements AutoCloseable {

    private static SomeClass instance;

    public static SomeClass getInstance() {

        return new SomeClass();

    }

    public void doSmth() {
        System.out.println("Our resource is doing something!!!");
    }

    @Override
    public void close() throws Exception {

        System.out.println("Our resource is free!!!");

    }


}
