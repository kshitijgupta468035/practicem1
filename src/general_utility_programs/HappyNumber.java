package general_utility_programs;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = scan.nextInt();
        int sum = 0;
        int f;
        while (sum !=1 && sum != 4) {
            sum = 0;

            while (n > 0) {
                f = n % 10;
                sum = sum + f * f;
                n = n / 10;
            }

            n = sum;
        }
        if (sum == 1) {
            System.out.println("Happy NUmber");
        } else {
            System.out.println("Not a happy Number");
        }
    }
}
