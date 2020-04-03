package general_utility_programs;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter base");
        int base = scan.nextInt();
        System.out.println("Enter height");
        int height = scan.nextInt();
        double area = (base * height) / 2;
        System.out.println("area is " + area );
    }
}
