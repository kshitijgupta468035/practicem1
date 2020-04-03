package string;

import java.util.Scanner;

public class StringHandle5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine().trim();
        String subString = scan.nextLine().trim();
        String replace = scan.nextLine().trim();
        inputString = inputString.replaceAll(subString, replace);
        System.out.println(inputString);
        scan.close();
    }

}