package day06_Shorthnd_LogicalOperators;

public class SingleIfStatement {

    public static void main(String[] args) {

        boolean coldweather=true;
        boolean hotweather=false;

        if (coldweather){
            System.out.println("weather is cold");
        }
        if(coldweather) System.out.println("weather is too cold");

        if(hotweather) System.out.println("weather is hot");

        System.out.println("=================================");
        int a=200;
        boolean evenNumber=a%2==0;
        boolean oddNumber=a%2!=0;

        if(evenNumber){
            System.out.println(a+" is even number");
        }

        if (!evenNumber){
            System.out.println(a+"is odd number");
        }
    }
}
