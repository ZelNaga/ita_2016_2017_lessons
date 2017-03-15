package lesson16;

import java.io.*;
import java.util.Arrays;

/**
 * Created by asv on 15.03.17.
 */
public class SustemInOut {

    public static void main(String[] args) throws IOException {

        /*OutputStream output = new FileOutputStream("system.out.txt");
        PrintStream printOut = new PrintStream(output);

        System.setOut(printOut);

        System.out.println("lksajflkajfdlasfdljdsf");*/



        for (int i = 0; i < 10; i++) {
           File f = new File(String.format("test/t%d.txt", i));

            f.createNewFile();


        }

        File file = new File("test");

        Arrays.asList(file.list()).forEach(System.out::println);

        File folders = new File("test/as/w/ew/df/eg");
        folders.mkdirs();




    }

}
