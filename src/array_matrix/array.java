package array_matrix;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[scanner.nextInt()];
        int max = 1;
        int length = 1;
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        for (int i = 1; i < values.length; i++) {
            if (values[i] > values[i - 1]) {
                length++;
            } else {
                length = 1;
            }
            if (length > max) {
                max = length;
            }
        }
        System.out.println(max);

    }
}



