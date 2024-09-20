package Practise_2;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getDogName() {return name;}
    public int getDogAge() {return age;}
    public void setNewAge(int new_age) {this.age = new_age;}
    public int convertToHumanAge() {return age*7;}

    @Override
    public String toString() {
        return "Dog's card:\n" + "Name:" + name + "\nAge:" + age + "\nAge in human: " + convertToHumanAge();
    }


}
