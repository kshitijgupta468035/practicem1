package string;

import java.util.Scanner;

public class StringHandle3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine().trim();
        char[] array = inputString.toCharArray();
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                array[i] = '*';
            }
        }
        for (int i = 0; i < inputString.length(); i++) {
            System.out.print(array[i]);
        }
        scan.close();
    }

}
