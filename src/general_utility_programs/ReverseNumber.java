package general_utility_programs;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = scan.nextInt();
        int f;
        int s = 0;
        while (n > 0) {
            f = n % 10;
            s = s * 10 + f;
            n = n / 10;
        }
        System.out.println(s);
    }
}
