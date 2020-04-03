package general_utility_programs;

import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        int add = n + 1;
        double root =  Math.sqrt(add);

        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                if (i == 0) {
                    break;
                }
                System.out.println("Hello");
            }
            System.out.println("hello");
        }

        if ((int)root == root) {
            System.out.println("Sunny Number");
        } else {
            System.out.println("Not a sunny Number");
        }
    }
}
