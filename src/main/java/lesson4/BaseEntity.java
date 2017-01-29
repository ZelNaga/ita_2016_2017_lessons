package lesson4;

/**
 * Created by asv on 15.12.16.
 */
public class BaseEntity {
    protected final int i;

    public BaseEntity(int i) {
        this.i = i;
    }

    protected final void someBaseMethod(final String s) {
        System.out.println("Hello from " + s);
    }

    protected void someOtherBaseMethod() {
        String s = "word";
        this.someBaseMethod(s);
    }
}
