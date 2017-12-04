package ooplab4;

public class TestMethods {

    public static void A(){                     //ไม่มีพารามิเตอร์
        System.out.println("Hello A");

    }//A

    public static void B(int x,int y, String s){    //มีพารามิเตอร์ กี่ตัวก็ได้
        System.out.println(s);

    }//B

    public static int C (int x, int y){             //ประกาศตัวแปล
        return x+y;
    }



    public static void main(String[] args) {
        A();
        int x=5,y=10;
        B(x,y,"Hello");
//        Manage return value       การแสดงผล
//วิธีที่ 1
        int z = C(x,y);
        System.out.println(z);

//วิธีที่ 2
        System.out.println(C(x,y));



    }//main
}//class
