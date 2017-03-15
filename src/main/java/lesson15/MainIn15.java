package lesson15;

import java.util.*;
import java.util.function.Consumer;

/**
 * Created by asv on 08.03.17.
 */
public class MainIn15 {

    public static void main(String args[]) {
        /*Integer[] ints = {1,2,3,4,5,6,7,8,9,10};

        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(ints));

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(ints));

        HashSet<Integer> set = new HashSet<>(Arrays.asList(ints));

        printIteratorElements(list.iterator());
        System.out.println();
        printIteratorElements(array.iterator());
        System.out.println();
        printIteratorElements(set.iterator());
        System.out.println();
        System.out.println("_________________________________");
        printForEachWithLambda(list);
        System.out.println();
        printForEachWithLambda(array);
        System.out.println();
        printForEachWithLambda(set);
        System.out.println();*/

        System.out.println(TestClass.class.getDeclaredAnnotation(OuerOwnAnnotation.class).value());

    }

    public static void printIteratorElements(Iterator<Integer> iterator) {
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            System.out.print(i + ", ");
        }
    }

    public static void printForEachWithLambda(Collection<Integer> collection) {
        collection.forEach(System.out::print);
    }

    public static void printForEachWithAnonimClass(Collection<Integer> collection) {
        collection.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer + ", ");
            }
        });
    }
}
