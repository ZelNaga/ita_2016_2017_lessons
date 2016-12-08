package lesson3;

/**
 * Created by asv on 08.12.16.
 */
public class OverrideObjectMethods {

    int size;

    public OverrideObjectMethods(int i) {
        this.size = i;
    }


    public boolean equals(Object o) {

        if (!(o instanceof OverrideObjectMethods)) {
            return false;
        }

        OverrideObjectMethods oom = (OverrideObjectMethods)o;
        return this.size == oom.size;
    }


    public String toString() {
        return "OverrideObjectMethods have field size - " + size;
    }
}
