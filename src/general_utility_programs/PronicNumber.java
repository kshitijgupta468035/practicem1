package general_utility_programs;

import java.util.Scanner;

public class PronicNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = scan.nextInt();
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (i * (i+1) == n) {
                flag = true;
                break;
            }
        }

        if (flag == true) {
            System.out.println("Pronic");
        } else {
            System.out.println("Not");
        }
    }
}
