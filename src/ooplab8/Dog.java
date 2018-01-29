package ooplab8;
//**dog เป็น sub-class
//**Pat เป็น super-class
public class Dog extends Pat{                       //คลาสdogสืบเนื่องมาจากคลาส pat
    public Dog(String name, String hairColor, String gender, String age) {
        super(name, hairColor, gender, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Box Box !!");

    }
}//Dog
