package ooplab5;

import java.util.ArrayList;
import java.util.Arrays;

public class myArrayList {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        //add method
        myList.add("DEE");
        System.out.println(myList);
        myList.add("Praew");
        myList.add("Gift");
        System.out.println(myList);
        System.out.println(myList.size());
        myList.add(2, "Hello");
        System.out.println(myList);
        myList.add(1, 100);
        System.out.println(myList);
        myList.set(0, "Pramhathai");
        System.out.println(myList);
        myList.remove("Hello");         //  ค่าที่ต้องการลบออกไป
        System.out.println(myList);
        System.out.println(myList.indexOf(100));    //หาค่าตำแหน่ง


    }//main
}//Class
