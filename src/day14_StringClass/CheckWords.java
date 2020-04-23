package day14_StringClass;

import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first word");
        String word1 = input.next();

        System.out.println("Enter your second word");
        String word2 = input.next();

        System.out.println("Enter your third word");
        String word3 = input.next();

        int length1 = word1.length();
        int length2 = word2.length();
        int length3 = word3.length();

        boolean NotSame = length1 != length2 && length2 != length3 && length1 != length3;
        boolean AllSame = length1 == length2 && length2 == length3;

        if(AllSame) {
            // if they are same lenght: "print "All words are same lenght""
            System.out.println("All words are same lenght");
        }
        else if (NotSame){

            System.out.println("All different lenght");
        }
        else {
            System.out.println("Not same nor different lenght");
        }
    }
}
