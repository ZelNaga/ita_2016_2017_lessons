package lesson7;

/**
 * Created by asv on 20.01.17.
 */
public class Outer {
    private String string = "private outer field";
    public static void main(String[] args) {
        Outer.InnerStaticlass staticlass = new Outer.InnerStaticlass();
        staticlass.someMethod();

        Outer outerClass = new Outer();
        InnerClass innerClass = outerClass.new InnerClass();
        innerClass.someMethod();
    }

    static class InnerStaticlass {
        public void someMethod() {
            System.out.println("someMethod() called in nested class");
        }
    }

    private class InnerClass {
        private String string = "private inner field";
        public void someMethod() {
            System.out.println("someMethod() called in inner class, " +
                    "and can get private fiels of outer class " + Outer.this.string + string);
        }
    }

    public void localClass() {
        class LocalClass {

        }

        //LocalClass localClass =
    }

    public void anonimousClass() {
        Runnable r = () -> System.out.println("run");

        Thread t = new Thread(r);
        t.start();
    }
}
