package general_utility_programs;

import java.util.Scanner;

public class MinMaxofArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scan.nextInt();
        int[] array = new int[size];

        int c = 1;
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + c  + " element: ");
            array[i] = scan.nextInt();
            c++;
        }

        int a = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > a) {
                a = array[i];
            }
        }
        System.out.println("maximum is " + a);

        int b = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < 0) {
                b = array[i];
            }
        }

        System.out.println("Minimum is " + b);


    }
}
