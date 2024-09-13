import java.util.Arrays;
import java.util.Scanner;


public class First {
    public static int factorial(int num) {
        int prod = 1;
        for (int i = 1; i < num + 1; i++) {
            prod *= i;
        }

        return prod;
    }

    public static void main(String[] args) {
        // 3 task
        Scanner sc = new Scanner(System.in);
        int length = 4;
        int sum = 0;

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println(String.format("Введите %d элемент массива: ", i));
            int number = sc.nextInt();
            sum += number;
            array[i] = number;
        }
        float mid = (float) sum / array.length;

        System.out.println(Arrays.toString(array));
        System.out.println(String.format("Cумма: %d", sum));
        System.out.println("Среднее: " + mid);

        // 4-th task
        System.out.println("\nЗадание 4");
        int[] array_2 = new int[length];
        int min = 100000000;
        int max = -100000;

        int i = 0;
        while (i < length)  {
            System.out.println(String.format("Введите %d элемент массива: ", i));
            array_2[i] = sc.nextInt();
            if (array_2[i] > max) max = array_2[i];
            if (array_2[i] < min) min = array_2[i];
            i++;
        }
        System.out.println(Arrays.toString(array_2));
        System.out.println(String.format("Максимальный: %d; Минимальный: %d", max, min));

        // 5 task
        System.out.println("\nЗадание 5");
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
        } else {
            System.out.println("Command-line arguments:");
            // Loop through the command-line arguments
            for (int j = 0; j < args.length; j++) {
                System.out.println("Argument " + (j + 1) + ": " + args[j]);
            }
        }

        // 6 task
        System.out.println("\nЗадание 6");
        for (int j = 1; j < 11; j++) {
            float k = (float) 1 / j;
            System.out.println(String.format("%.2f", k));
        }

        // 7 task
        System.out.println("\nЗадание 7");
        System.out.println("Введите число: ");
        int num = sc.nextInt();
        System.out.println(String.format("factorial(%d) = %d", num, factorial(num)));
    }
}

