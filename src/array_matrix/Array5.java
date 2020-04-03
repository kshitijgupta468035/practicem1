package array_matrix;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        int count = 0;

        int numberToBeCount = scan.nextInt();
        for (int i = 0; i < n; i++) {
            if (numberToBeCount == array[i]) {
                count++;
            }
        }
        System.out.println("number is ");
        System.out.println(count);
    }
}
