package day12_JavaRecap;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.sql.SQLOutput;

import java.util.Scanner;

public class Scanner_Next {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // String str = Scan.Next();
        // System.out.println(str);  // next() only takes first word

        // 7921 JonesBranch Dr, McLean VA, 22034

        String fullAddress = "";

        System.out.println("Enter the number of building: ");
        short Bnumber = input.nextShort();
        fullAddress += Bnumber+" ";      // fullAddress = fullAdress+Bnumber+""

        System.out.println("Enter the Street Name: ");
        String streetName = input.next();
        fullAddress += streetName+" ";

        System.out.println("Enter your type of road: ");
        String roadName = input.next();
        fullAddress += roadName+", ";

        System.out.println("Enter city name, state, zipcode");
        String cityName = input.next();
        fullAddress += cityName+" ";

        String state = input.next();
        fullAddress += state+", ";

        int zipCode = input.nextInt();
        fullAddress += zipCode;

        System.out.println(" Address is: "+fullAddress);
    }
}
