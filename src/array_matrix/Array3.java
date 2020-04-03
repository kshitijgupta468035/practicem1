package array_matrix;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] list = new int[50];
        System.out.println("Enter the size of the ArrayList");
        int n = scan.nextInt();
        System.out.println("Enter the Elements of Array");
        for (int i = 0; i < n; i++) {
            list[i] = scan.nextInt();
        }
        System.out.println("position");
        int position = scan.nextInt();
        System.out.println("value");
        int value = scan.nextInt();

        for (int i = n - 1; i >= position - 1; i-- ) {
            list[i + 1] = list[i];
        }
        list[position - 1] = value;

        for (int i = 0; i < n + 1; i++) {
            System.out.println(list[i] + " ");
        }

    }
}
