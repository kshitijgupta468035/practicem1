package general_utility_programs;

import java.util.Scanner;

public class AareaOfPentagon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side");
        int side = scan.nextInt();
        double area = (Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * side * side) / 4;
        System.out.println(area);
    }
}
