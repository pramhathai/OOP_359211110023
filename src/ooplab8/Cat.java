package ooplab8;

public class Cat extends Pat{
    public Cat(String name, String hairColor, String gender, String age) {
        super(name, hairColor, gender, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meaw Meaw !!");
    }//main
}//class
