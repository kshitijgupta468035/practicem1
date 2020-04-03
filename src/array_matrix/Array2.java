package array_matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {

    public static int[] arrayMerge(int[] array1, int[] array2) {
        int l1 = array1.length;
        int l2 = array2.length;
        int max = l1 + l2;
        int[] mergeArray = new int[max];
        int a = 0;
        int b = 0;
        int v = 0;
        while (v < max) {
            if (a < l1) {
                mergeArray[v] = array1[a];
                a++;
                v++;
            } else if (b < l2) {
                mergeArray[v] = array2[b];
                b++;
                v++;
            }
        }
        return mergeArray;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array1 = new int[6];
        int[] array2 = new int[7];
        System.out.println("Enter the elements of first array");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scan.nextInt();
        }
        System.out.println("Enter the elements of second array");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scan.nextInt();
        }

        System.out.println("MergeArray");
        int[] mergeArray = arrayMerge(array1, array2);
        System.out.println(Arrays.toString(mergeArray));
    }
}
