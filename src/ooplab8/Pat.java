package ooplab8;

public class Pat {
    private String name;
    private String hairColor;
    private String gender;
    private String age;
    //constructor

    @Override
    public String toString() {
        return "Pat{" +
                "name='" + name + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public Pat(String name, String hairColor, String gender, String age) {
        //assign data object properties
        this.name = name;
        this.hairColor = hairColor;
        this.gender = gender;
        this.age = age;}

    public void makeNoise(){}
    //getter and setter method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
