package lesson14;

/**
 * Created by asv on 01.03.17.
 */
public class MainIn14 {


    public static void main(String[] args) {
        try (SomeClass r = SomeClass.getInstance()) {




        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
