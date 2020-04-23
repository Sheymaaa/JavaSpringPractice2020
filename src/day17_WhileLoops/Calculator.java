package day17_WhileLoops;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        for(int i= 0;true;){

            System.out.println("Enter first number:");
            int num1 = input.nextInt();

            System.out.println("Enter second number:");
            int num2 = input.nextInt();

            System.out.println("Math Operator: ");
            String operator =input.next();  //  +, -, *, /, %

            if(operator.equals("+")){
                System.out.println("Addition is: "+(num1+num2));
            }else if(operator.equals("-")){
                System.out.println("Subtraction is: "+(num1-num2));
            }else if(operator.equals("*")){
                System.out.println("Multiple is: "+(num1*num2));
            }else if (operator.equals("/")){
                System.out.println("Division is: "+(num1/num2));
            }else if(operator.equals("%")){
                System.out.println("remainder is: "+(num1%num2));
            }else {
                System.out.println("Invalid operator");
            }

            System.out.println("Do you wanna continue");
            String answer = input.next();

            if(answer.equalsIgnoreCase("no")){
                break;
            }
        }
    }
}
