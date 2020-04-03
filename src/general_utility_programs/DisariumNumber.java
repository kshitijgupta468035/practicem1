package general_utility_programs;

import java.util.Scanner;

public class DisariumNumber{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = scan.nextInt();
        int num = n;
        int num1 = n;
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        int sum = 0;
        int f;
        while (num > 0) {
            f = num % 10;
            sum = sum + (int) Math.pow(f, count);
            count--;
            num = num / 10;
        }

        if (sum == num1) {
            System.out.println("Disarium Number");
        } else {
            System.out.println("Not");
        }
    }

    /**
     * This method is used to check the Number whether it is Spy Number or Not
     */

}
