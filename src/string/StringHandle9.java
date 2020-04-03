package string;

import java.util.Scanner;

public class StringHandle9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine().trim();
        int sum = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (c > 64 && c < 92) {
                sum = sum + inputString.charAt(i);
            }
        }
        System.out.print(sum);
        scan.close();
    }
}
