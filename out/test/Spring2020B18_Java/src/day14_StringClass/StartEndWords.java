package day14_StringClass;

import java.util.Scanner;

public class StartEndWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");
        String word1 = input.next();

        System.out.println("Enter second word");
        String word2 = input.next();

        int lenght1 = word1.length();
        int lenght2 = word2.length();

        if(lenght1 == 5 && lenght2 == 5){

            if (word2.charAt(0) == word1.charAt(lenght1-1)){

                System.out.println("Fizz");
            }
            else{

                System.out.println("Buzz");
            }
        }

        else{

            System.out.println("need to be exactly 5 chars length");
        }
    }
}
