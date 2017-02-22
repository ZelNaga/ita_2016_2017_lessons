package lesson11;

import java.util.Comparator;
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
        Employee e2 = new Employee(6, "q");
        Employee e3 = new Employee(7, "t");
        Employee e4 = new Employee(11, "w");
        Employee e5 = new Employee(99, "n");
        Employee e6 = new Employee(0, "a");

        TreeSet<Employee> employeesByFirstName = new TreeSet<>();

        employeesByFirstName.add(e1);
        employeesByFirstName.add(e2);
        employeesByFirstName.add(e3);
        employeesByFirstName.add(e4);
        employeesByFirstName.add(e5);
        employeesByFirstName.add(e6);

        for (Employee e : employeesByFirstName) {
            System.out.println(e);
        }

        System.out.println("\n");

        TreeSet<Employee> employeesById = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return  e1.employeeId.compareTo(e2.employeeId);
            }
        });

        employeesById.add(e1);
        employeesById.add(e2);
        employeesById.add(e3);
        employeesById.add(e4);
        employeesById.add(e5);
        employeesById.add(e6);

        for (Employee e : employeesById) {
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
