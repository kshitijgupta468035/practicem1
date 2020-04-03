package general_utility_programs;

import java.util.Scanner;

public class PerfectNUmber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        int i = 1;
        int sum = 0;
        while (i < n) {
            if (n % i == 0) {
                sum = sum + i;
            }
            i++;
        }

        if (sum == n) {
            System.out.println("Perfect NUmber");
        } else {
            System.out.println("Not a perfect Number");
        }

    }
}
