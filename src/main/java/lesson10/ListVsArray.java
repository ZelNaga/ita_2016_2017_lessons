package lesson10;

import com.google.common.base.Stopwatch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by asv on 01.02.17.
 */
public class ListVsArray {

    public static final int ITERATIONS = 1000000;

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        List<Integer> array  = new ArrayList<>();


        Stopwatch sw = Stopwatch.createUnstarted();
        fillList(list, "LinkedList", sw);
        fillList(array, "ArrayList", sw);



        System.out.println(list.get(ITERATIONS / 2));

        System.out.println("Get element from middle of the list " + sw.stop());
        System.out.println(sw.reset().start());

        array.get(ITERATIONS/2);
        System.out.println("Get element from middle of the array " + sw.stop());

        System.out.println(sw.reset().start());

        for (int i = 0; i < 100; i++) {
            list.set(ITERATIONS/2, i);
        }

        System.out.println("Insert to middle of the list " + sw.stop());
        System.out.println(sw.reset().start());


        for (int i = 0; i < 100; i++) {
            array.set(ITERATIONS/2, i);
        }

        System.out.println("Insert to middle of the array " + sw.stop());



    }

    public static void fillList(List<Integer> list, String collectionName, Stopwatch sw) {
        sw.reset().start();
        for (int i = 0; i < ITERATIONS; i++) {
            list.add(i);
        }

        System.out.println(String.format("Fill %s %s !", collectionName, sw.stop() ));
    }
}
