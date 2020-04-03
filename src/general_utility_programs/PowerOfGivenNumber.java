package general_utility_programs;

import java.util.Scanner;

public class PowerOfGivenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = scan.nextInt();
        System.out.println("Enter Power");
        int p = scan.nextInt();

        int ans = (int) Math.pow(n,p);
        System.out.println(ans);
    }
}
