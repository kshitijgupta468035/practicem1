package general_utility_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static boolean AnagramChecker(String first, String second) {
        if (first.equals(second)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first String");
        String first = scan.nextLine();
        System.out.println("Enter Second String");
        String second = scan.nextLine();
        first = first.toLowerCase();
        second = second.toLowerCase();

        char[] ch = first.toCharArray();
        char[] ch2 = second.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);
        first = new String(ch);
        second = new String(ch2);
        System.out.println(first + " " + second);
        boolean answer = AnagramChecker(first, second);

        if (answer == true) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }

    }
}
