package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine_Practice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Enter

        //7981 JonesBranch Dr, McLean VA. 22034
        //fullAddress: Building-number Street, city, state zipcode

        System.out.println("Building Number: ");
        int Bnumber = input.nextInt();
        System.out.println("Building number is: "+Bnumber);

        input.nextLine();   //used for taking out the Enter from Scanner

        System.out.println("Street: ");
        String street = input.nextLine();
        System.out.println("Street is: "+street);

        System.out.println("Enter the zip code: ");
        int zipCode = input.nextInt();

        input.nextLine();   // take out the Enter

        System.out.println("Enter the city name and state seperated by comma and space");
        String cityState = input.nextLine();
        String fulladdress = Bnumber+" "+street+", \n"+cityState+" "+zipCode;

        System.out.println(fulladdress);

        input.close(); // close scanner
    }
}
