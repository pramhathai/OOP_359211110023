package ooplap7;

import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {

        SuperCar s = new SuperCar();
        s = inputData(s);

        s.getSuperCarInfo(s);

    }//class


    private static SuperCar inputData(SuperCar s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter SuperCar: ");
        System.out.println("Enter carbrand: ");
        s.setcarbrand(scanner.nextLine());
        System.out.print("Enter carcolor: ");
        s.setCarcolor(scanner.nextLine());
        System.out.println("Enter carenginesize: ");
        s.setCarenginesize(scanner.nextLine());
        System.out.println("Enter maxspeed: ");
        s.setMaxspeed(scanner.nextLine());
        System.out.println("Enter countryoforigin");
        s.setCountryoforigin(scanner.nextLine());

        return s;
    }





}//main
