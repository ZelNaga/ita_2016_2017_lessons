package lesson11;

import java.util.Comparator;

/**
 * Created by asv on 15.02.17.
 */
public class OurComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return  e1.employeeId.compareTo(e2.employeeId);
    }
}
