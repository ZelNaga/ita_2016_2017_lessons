package lesson11;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by asv on 08.02.17.
 */
public class MainIn11 {

    public static void main(String[] args) {

        /*TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(9);
        treeSet.add(22);
        treeSet.add(1);
        treeSet.add(533);

        for (Integer i : treeSet) {
            System.out.println(i);
        }*/
        Employee employeeJon1 = new Employee(1, "Jon");
        Employee employeeJon2 = new Employee(2, "Jon");

        System.out.println(employeeJon1);
        HashSet<Employee> hashSet = new HashSet<>();

        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);

        System.out.println(employeeJon1.equals(employeeJon2));
        System.out.println(i1.equals(i2));


        hashSet.add(employeeJon1);
        hashSet.add(employeeJon2);


        System.out.println(hashSet.size());


    }

}
