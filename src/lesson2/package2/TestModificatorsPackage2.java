package lesson2.package2;

import lesson2.package1.FromPackage1;

/**
 * Created by asv on 01.12.16.
 */
public class TestModificatorsPackage2 extends FromPackage1 {
    static FromPackage1 fromPackage1 = new FromPackage1();

    public static void main(String[] args) {
        System.out.println( /*fromPackage1.packageVarFromPackage1Class + " " +
                            fromPackage1.protectedVarFromPackage1Class + " " +*/
                            fromPackage1.publicVarFromPackage1Class);

    }
}
