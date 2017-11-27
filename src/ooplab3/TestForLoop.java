package ooplab3;

public class TestForLoop {
    public static void main(String[] args) {

    //for (int i =1; i<=10; i++)
    //    System.out.print(" "+i);                      //เรียงตามลำดับ

    //for (int i =1; i<=100; i=i+2)                     //เรียงค่าเลขคี่ 1 3 5 7 ...
    //    System.out.print(" "+i);

     //   for (int i =2; i<=100; i=i+2)                 //เรียงค่าเลขคู่ 2 4 6....
     //       System.out.print(" "+i);

        for (int i =1; i<=100; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0)
                System.out.print(" "+ i);               //ค่าที่หาร 3 5 7 ลงตัว
        }//for






    }//main

}//close
