package lesson12;

/**
 * Created by asv on 15.02.17.
 */
public class MainIn12 {

    public static void main(String[] args) {

        System.setErr(System.out);
        System.err.println("lksdjflksdjflksdjf");
        try {
//            System.exit(0);
            int a = 2;
            int b = 0;
            //someDangerousMethod();
            validateArgs(a, b);
            try {
                int result = a / b;
            } catch (ArithmeticException e) {

                System.out.println("Watch what you print !!! args " + a + " " + b);
                e.printStackTrace();
                throw new Exception("Some message");

            } finally {
                System.out.println("Finally inner block");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    public static void someDangerousMethod() throws Exception {
        throw new  Exception("Exception from someDangerousMethod");
    }

    public static void validateArgs(int a, int b) throws IllegalArgumentException {
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("Bad arguments");
        }
    }
}
