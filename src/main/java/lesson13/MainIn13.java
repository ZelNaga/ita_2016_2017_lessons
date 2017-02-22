package lesson13;

/**
 * Created by asv on 22.02.17.
 */
public class MainIn13 {

    public static void main(String[] args) {
        /*System.err.println("start main");

        try {
            a();
        } catch (Error e) {
            System.err.println("Cached Error");
        }

        a();

        System.err.println("end main");*/

        try {

            System.out.println("Rectangle Square = " + calculateRectangleSquare(-1, 7));

        } catch (IllegalArgumentException e) {

            System.out.println("Re enter method arguments " + e.getMessage());

        }




    }

    public static void a() {

        System.err.println("start    a.");
        b();
        System.err.println("end       a.");

    }

    public static void b() {

        System.err.println("start           b.");
        c();
        System.err.println("end              b.");

    }

    public static void c()  {

        System.err.println("start                   c.");
        if (true) {

            throw new Error();

        }
        System.err.println("end                     c.");

    }

    public static String getMassage() {

        try {

            return "form catch";

        } finally {

            return "form finally";

        }
    }

    public static int calculateRectangleSquare(int a, int b) {

        if (a < 0 || b < 0) {
            String message = String.format("Bad credentials a = %s, b = %s !!!", a, b);
            throw new IllegalArgumentException(message);

        }

        return a * b;
    }
}
