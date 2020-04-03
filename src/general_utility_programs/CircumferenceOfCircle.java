package general_utility_programs;

import java.util.Scanner;

public class CircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius");
        int radius = scan.nextInt();
        double circumference = 2 * 3.14 * radius;
        System.out.printf("circumference is %f", circumference);
    }
}
