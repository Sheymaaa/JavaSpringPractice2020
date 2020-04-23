package day23_Methods;

public class Methods {

    public static void main(String[] args) {

        evenNumbers1_100();
        oddNumbers1_100();

    }

    public static void evenNumbers1_100() {

        for(int i=1; i <= 100; i++ ){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }
    }

    public static void oddNumbers1_100() {

        for(int i=1; i <= 100; i++ ){
            if(i % 2 != 0){
                System.out.print(i+" ");
            }
        }
    }

}
