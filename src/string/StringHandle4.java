package string;

import java.util.Scanner;

public class StringHandle4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine().trim();
        char[] array = inputString.toCharArray();
        int d = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                d = (d + 1) % 4;
                array[i] = '*';
                if (d == 1)
                    array[i] = '*';
                else if (d == 2)
                    array[i] = '^';
                else if (d == 3) {
                    array[i] = '@';
                    d = d + 1;
                }
            }
        }
        for (int i = 0; i < inputString.length(); i++) {
            System.out.print(array[i]);
        }
        scan.close();
    }
}
