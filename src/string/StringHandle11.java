package string;

import java.util.Scanner;

public class StringHandle11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine().trim();
        char ch = scan.nextLine().trim().charAt(0);
        for (int i = 0; i < inputString.length(); i++) {
            //char c = inputString.charAt(i);
            if (inputString.charAt(i) == ch) {
                System.out.println(i);
            }
        }
    }
}
