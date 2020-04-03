package general_utility_programs;

import java.util.Arrays;
import java.util.Scanner;

public class LargestAmongNDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);
        System.out.println(array[n-1]);
    }
}
