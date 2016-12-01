package lesson2.package1;

/**
 * Created by asv on 01.12.16.
 */
public class TestModificatorsPackage1 {
    static FromPackage1 fromPackage1 = new FromPackage1();

    public static void main(String[] args) {
        System.out.println( fromPackage1.packageVarFromPackage1Class + " " +
                            fromPackage1.protectedVarFromPackage1Class + " " +
                            fromPackage1.publicVarFromPackage1Class);
    }

}
