package Practise_3;
import java.util.*;

public class Task_1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Write down n: ");
        int n = sc.nextInt();
        while (n < 0) {
            System.out.println("Wrong n! Write down n: ");
            n = sc.nextInt();
        }
        int[] arr = new int[n];
        int[] arr_even = new int[0];
        int i_even = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n+1);
            if (arr[i] % 2 == 0) {
                arr_even = Arrays.copyOf(arr_even, arr_even.length + 1);
                arr_even[i_even] = arr[i];
                i_even++;
            }
        }

        System.out.println("Array: " + Arrays.toString(arr));
        if (arr.length != 0) {
            System.out.println("Even numbers: " + Arrays.toString(arr_even));
        }
    }
}
