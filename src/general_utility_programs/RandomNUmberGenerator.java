package general_utility_programs;

import java.util.Random;
import java.util.Scanner;

public class RandomNUmberGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the maximum numbers you want");
        int n = scan.nextInt();
        System.out.println("Enter the number upto which you" +
                "want your numbers");
        int range = scan.nextInt();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            System.out.print(random.nextInt(range) + " ");
        }
    }
}
