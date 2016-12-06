package lesson2;

/**
 * Created by asv on 01.12.16.
 */
public class ChildEntity extends BaseEntity {
    public static void main(String[] args) {
        ChildEntity childEntity = new ChildEntity();
        childEntity.baseMethod();
        childEntity.baseMethod(1);
        childEntity.baseMethod("Some word", new Integer(1));
    }

    void baseMethod() {
        System.out.println("Hello from override baseMethod !!!");
    }

    void baseMethod(int i) {
        System.out.println("Hello from override baseMethod !!! And plus int " + i);
    }

    void baseMethod(String s, Integer i) {
        System.out.println("Hello from override baseMethod !!!  And plus Integer " + s);
    }

    void baseMethod(String s, int i) {
        System.out.println("Hello from override baseMethod !!!  And plus int " + s);
    }




}
