package ooplab4;

public class OverloadMethod {                   //วัตถุที่มีชื่อเหมือนกัน แต่มีพารามิเตอร์ที่ต่างกัน

    private static int value = 100;



    public static void A(){
        System.out.println("Hello");
        int number = 20;
        System.out.println(number);
        System.out.println(value);
    }

    public static void A(int x){
        System.out.println("Hello "+x);
    }

    public static void A(int x,int y){
        System.out.println("Hello "+ (x+y));
    }



    public static void main(String[] args) {

//        OverloadMethod
        A();
        A(5);
        A(5,10);

//        local variabal
        int number = 10;


    }//main
}//class
