package general_utility_programs;

import java.util.Scanner;

public class SuperDigit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        while (n >= 10) {
            int x = n;
            int sum = 0;
            while (x > 0) {
                int f = x % 10;
                sum = sum + f;
                x = x / 10;
            }
            n = sum;
        }
        System.out.println("Super digit is " + n);

    }
}
