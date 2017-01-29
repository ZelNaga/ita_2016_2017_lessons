package lesson5;

import java.math.BigInteger;

/**
 * Created by asv on 22.12.16.
 */
public class MainIn5 {
    public static void main(String[] args) {
        /*int mb = 1024*1024;
        System.out.println("freeMemory " + Runtime.getRuntime().freeMemory()/mb);
        System.out.println("maxMemory " + Runtime.getRuntime().maxMemory()/mb);
        System.out.println("totalMemory " + Runtime.getRuntime().totalMemory()/mb);*/

        System.out.println(iterativelyFibonacci(100));
        System.out.println("");
        System.out.println(recursivelyFibonacci(100));


    }

    public static void infinityRecursion(long i) {
        System.out.println(i);
        i++;
        infinityRecursion(i);
    }

    static int iterativelyFibonacci(int arg) {
        int[] arr = new int[arg + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }

        return arr[arg];

    }

    static int recursivelyFibonacci(int arg) {
        int result = arg < 2 ? arg :
                            recursivelyFibonacci(arg - 1) + recursivelyFibonacci(arg - 2);

        //System.out.print(result + " ");
        return result;
    }
}
