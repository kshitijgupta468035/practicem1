package general_utility_programs;

import java.util.ArrayList;
import java.util.Scanner;

import static general_utility_programs.SpyNumber.*;

public class SpyNumber1toN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter lower limit");
        int l = scan.nextInt();
        System.out.println("Enter upper Limit");
        int n = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = l; i <= n; i++) {
            int a = sum(i);
            int b = product(i);
            if (a == b) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
