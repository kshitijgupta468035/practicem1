package general_utility_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Allprime1toN {

    public static int primeNumber(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c = c + 1;
            }
        }
        if (c == 2) {
            return n;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the range from 1 to n");
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = primeNumber(i + 1);
        }
        Arrays.sort(array);
        for (int i = 0; i < n; i++) {
            if (array[i] != 0) {
                System.out.println(array[i]);
            }
        }

    }
}
