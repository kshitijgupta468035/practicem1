package general_utility_programs;

import java.util.Scanner;

public class StrongNumber {

    public static int factorial(int fact) {
        int f = 1;
        for (int i = 1; i <= fact; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number");
        int n =  scan.nextInt();
        int h = n;
        int f;
        int g;
        int sum = 0;
        while (n > 0) {
            f = n % 10;
            g = factorial(f);
            sum = sum + g;
            n = n / 10;
        }
        if (h == sum) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not a Strong Number");
        }
    }
}
