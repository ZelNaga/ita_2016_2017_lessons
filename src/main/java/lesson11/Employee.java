package lesson11;

/**
 * Created by asv on 08.02.17.
 */
public class Employee {
    public long   employeeId;
    public String firstName;

    public Employee(long employeeId, String firstName) {
        this.employeeId = employeeId;
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return String.format("{employeeId=%s, firstName=%s}", employeeId, firstName);
    }

    public boolean equals(Object o){
        if(o == null) return false;

        if(o instanceof Employee) {
            Employee other = (Employee) o;
            if( this.employeeId == other.employeeId &&
                this.firstName.equals(other.firstName)) return true;
        }

        return false;
    }

    public int hashCode(){
        return (int) employeeId *
                firstName.hashCode();
    }
}
