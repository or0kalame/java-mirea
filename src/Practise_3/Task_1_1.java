package Practise_3;

import java.util.*;


public class Task_1_1 {
    public static void main(String[] args) {
        int length = 10;
        double[] arr = new double[length];

        for (int i = 0; i < length; i++) {
            arr[i] = Math.random();
        }

        System.out.println("Unsorted array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        double[] arr_2 = new double[length];
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            arr_2[i] = rand.nextDouble(10);
        }
        System.out.println("\nUnsorted array with Random class: " + Arrays.toString(arr_2));
        Arrays.sort(arr_2);
        System.out.println("Sorted array with Random class: " + Arrays.toString(arr_2));
    }
}
