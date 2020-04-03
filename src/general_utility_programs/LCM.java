package general_utility_programs;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First Number");
        int first = scan.nextInt();
        System.out.println("Second Number");
        int second = scan.nextInt();
        int bigger;
        int smaller;
        if (first > second) {
            bigger = first;
            smaller = second;
        } else {
            bigger = second;
            smaller = first;
        }

        for (int i = 1; i <= bigger; i++) {
            if ((bigger * i) % smaller == 0) {
                int lcm = bigger * i;
                System.out.println("lcm " + lcm);
                break;
            }

        }
    }
}
