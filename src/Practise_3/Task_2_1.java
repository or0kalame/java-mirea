package Practise_3;
import java.util.*;

public class Task_2_1 {
    public static void main(String[] args) {
        String str = "3.14";
        Double obj = Double.valueOf("3.14");

        double num = Double.parseDouble(str);
        System.out.println(num);

        double primitiveDouble = obj.doubleValue();
        float primitiveFloat = obj.floatValue();
        long primitiveLong = obj.longValue();
        int primitiveInt = obj.intValue();

        System.out.println(obj.toString());


    }

}
