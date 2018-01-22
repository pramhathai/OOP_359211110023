package ooplap7;

import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {

        SuperCar s = new SuperCar();
        s = inputData(s);

        getSuperCarInfo(s);

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

    private static void getSuperCarInfo(SuperCar s) {
        System.out.println("SuperCar: ");
        System.out.println("carbrand: " + s.getcarbrand());
        System.out.println("carcolor: " + s.getCarcolor());
        System.out.println("size: " + s.getCarenginesize());
        System.out.println("peed: " + s.getMaxspeed());
        System.out.println("forigin: " + s.getCountryoforigin());
    }



}//main
