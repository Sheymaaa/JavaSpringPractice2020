package day10_Switch_Scanner;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner_Practice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number");
        byte num1 = input.nextByte();
        System.out.println("Enter your second number");
        byte num2 = input.nextByte();

        System.out.println("The sum of those numbers are: "+ (num1+num2));


    }

}
