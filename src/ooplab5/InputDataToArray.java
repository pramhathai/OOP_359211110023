package ooplab5;

import java.util.Scanner;

//1. declary array as Input  ทำการประกาศตัวแปรขึ้นมา
//2. allow user to input data array ให้ user input ข้อมูลแสดงค่าที่อยู่ใน Array
//3. show data in array โชว์ข้อมูลใน Array
public class InputDataToArray {
    private static int MAX = 5;
    public static void main(String[] args) {
        Integer []num = new Integer[MAX];
        //int []num2 = new int[MAX];
        num = InputData(num);
        showData(num);
    }//main


    private static void showData(Integer[] num) {           //ตัวอย่างในการแสดง showdata ค่าที่เราใส่ไป
        System.out.println("Data in array");
//        for (int i = 0; i < num.length; i++) {
//            System.out.print(num[i] + " ");
//        }
        //enhance loop
        for (int i : num) {
            System.out.println();

        }
        System.out.println();
    }


    private static Integer[] InputData(Integer[] num) {         //ตัวอย่างในการแสดง output จำนวนเต็ม
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        for (int i=0;i<num.length;i++){
            System.out.print("num["+i+"]: ");
            num[i] = scanner.nextInt();

        }


        return num;
    }
    //inputData

}//Class
