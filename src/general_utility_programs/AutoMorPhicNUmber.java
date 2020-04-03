package general_utility_programs;

import java.util.Scanner;

public class AutoMorPhicNUmber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        int num = n;
        int square = n * n;
        int f;
        int t = 10;
        boolean flag = false;
        while (n > 0) {
            f = square % t;
            if (num == f) {
                flag = true;
                break;
            }
            n = n / 10;
            t = t * 10;
        }

        if (flag == true) {
            System.out.println("Automorphic number");
        } else {
            System.out.println("Not A Automorphic Number");
        }
    }
}
