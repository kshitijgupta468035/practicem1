package array_matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter the Elements of the array");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Unsorted array");
        System.out.println(Arrays.toString(array));

        int t = array[0];
        for (int i = 1; i < 5; i++) {
            if (array[i] > t) {
                t = array[i];
            }
        }
        int t1 = array[0];
        for (int i = 1; i < 5; i++) {
            if (array[i] < t1) {
                t = array[i];
            }
        }
        System.out.println("Maxium " + t);
        System.out.println("Minimun " + t1);

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (array[i] > array[j]) {
                    int f = array[i];
                    array[i] = array[j];
                    array[j] = f;
                }
            }

        }
        System.out.println("Sorted Array in Ascending Order");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (array[i] < array[j]) {
                    int f = array[i];
                    array[i] = array[j];
                    array[j] = f;
                }
            }
        }
        System.out.println("Descending array");
        System.out.println(Arrays.toString(array));
    }
}

