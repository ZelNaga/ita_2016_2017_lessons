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
        Employee e1 = new Employee(1, "z");
        Employee e2 = new Employee(2, "q");
        Employee e3 = new Employee(2, "t");
        Employee e4 = new Employee(2, "w");
        Employee e5 = new Employee(2, "n");
        Employee e6 = new Employee(2, "a");

        TreeSet<Employee> employees = new TreeSet<>();

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);

        for (Employee e : employees) {
            System.out.println(e);
        }

        /*System.out.println(employeeJon1);
        HashSet<Employee> hashSet = new HashSet<>();

        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);

        System.out.println(employeeJon1.equals(employeeJon2));
        System.out.println(i1.equals(i2));


        hashSet.add(employeeJon1);
        hashSet.add(employeeJon2);*/


        //System.out.println(e1.compareTo(e2));


    }

}
