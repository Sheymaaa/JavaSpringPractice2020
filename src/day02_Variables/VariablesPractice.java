package day02_Variables;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;
import sun.awt.geom.AreaOp;

public class VariablesPractice {

    public static void main(String[] args) {

        int salary = 120000;
        double federalTax = 0.18;
        float stateTax = 0.065f;

        double sumTaxes = federalTax + stateTax;
        double salaryAfterTax = salary * (1 - sumTaxes);
        System.out.println(salaryAfterTax);

        System.out.println("================================");



    // area of the circle=    r*r*pi

        double r = 5.5;
        double area=r*r*3.14;
        System.out.println(area);

        System.out.println("===============================");

        int kg=60;
        double pound=kg*2.25;
        System.out.println(pound);

        System.out.println("===============================");

        double lira=1000;
        double liraInDolar=lira/6.15;
        System.out.println(liraInDolar);

        double rupi=1000;
        double rupiInDolar=rupi*0.014;
        System.out.println(rupiInDolar);

        System.out.println("==============================");
        
    }
}