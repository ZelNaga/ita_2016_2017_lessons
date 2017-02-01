package lesson10;

/**
 * Created by asv on 01.02.17.
 */
public class FluentInterface {
    private int i;
    private String s;

    public static void main(String[] args) {
        FluentInterface fi = new FluentInterface();
        fi.setI(123).setS("Some string");
        System.out.println(fi.getI() + " " + fi.getS());
    }

    public FluentInterface setI(int i) {
        this.i = i;
        return this;
    }

    public FluentInterface setS(String s) {
        this.s = s;

        return this;
    }

    public int getI() {
        return i;
    }

    public String getS() {
        return s;
    }
}
