package Practise_2;
import java.lang.*;

public class TestDog {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog("Ben", 7), new Dog("John", 2), new Dog("Casper", 4)};

        for (int i = 0; i < dogs.length;  i++) {
            System.out.println(dogs[i].toString() + '\n');
        }
    }

}
