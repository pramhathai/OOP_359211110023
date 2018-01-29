package ooplab8;

public class PatApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Bow",
                "whigh",
                "Female",
                "2");

        System.out.println(dog.toString());

        Cat cat = new Cat("May", "Rad", "Femle", "3");
        System.out.println(cat.getClass()+" "+cat.toString());

        dog.makeNoise();
        cat.makeNoise();
    }
}
