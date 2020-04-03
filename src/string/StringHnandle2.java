package string;

import java.util.Scanner;

public class StringHnandle2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        int indexValue = Integer.parseInt(scan.nextLine());
        System.out.println(string.substring(indexValue));
        //string = string.substring(indexValue);
        //System.out.println(string);
        //String stringSub = string.substring(indexValue);
        //System.out.println(stringSub);
    }
}
