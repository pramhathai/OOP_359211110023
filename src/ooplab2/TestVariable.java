package ooplab2;

public class TestVariable {

    public static void main(String[] args) {
//  Integer
        int i;
        i = 10;
        System.out.println("i = " + i);
        int j = 20;
        System.out.println("j = " + j);
        System.out.println("i+j = " + (i + j));

//        Double
        double v;
        v = 5.5;
        System.out.println("v = " + v);
        i = (int) v;
        System.out.println("i = " + i);

//        Char
        char c = 'x';
        System.out.println("c = " + c);
        c = 'y';

//        String
        String s;
        String s1 = "Hello world";
        System.out.println(s1 + "I'm DEE");
        int x = s1.length();
        System.out.println(x);
        System.out.println(s1.toUpperCase());           //s1.toUpperCase ตัวอักษรพิมใหญ่
        System.out.println(s1.toLowerCase());           //s1.toLowerCase ตัวอักษรพิมเล็ก
        System.out.println(s1.concat(" Pramhathai "));

//        String to int
        String number = "50";
        int y = Integer.parseInt(number);               //  แปลงค่า y เป็น integer แปลงค่าจากข้อความเป็นตัวเลข
        System.out.println(y);

//        Boolean
        boolean b = true;
        System.out.println(b);
        b = false;
        System.out.println(b);

//        short cut operator
        int z = 10;
        int t = ++z;
        System.out.println(z);
        System.out.println(t);




    }// main




}// class
