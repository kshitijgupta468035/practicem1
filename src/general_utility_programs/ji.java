package general_utility_programs;

import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] b = new int[n];
        String[] str = new String[n];
        int d = 0;
        int c = 0;
        int f = 0;

        for (int i = 0; i < n; i++) {
            int j = scan.nextInt();
            String s = scan.nextLine();
            b[i] = j;
            str[i] = s;
            f = f + b[i];

            for (int k = 0; k < n; k++) {
                if (d < b[k]) {
                    d = b[k];
                    c = k;
                }

            }
            System.out.println(b[0]);
        }
        if (d != 0) {
            System.out.println(str[c].trim());
        } else {
            System.out.println("No Frequent Buyer");
        }
        System.out.println(f);

    }
}



 class Solution2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        String[] s = new String[n];
        int f = 0;
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
            s[i] = scan.nextLine();
            f = f + ar[i];
        }
        System.out.println(f);
        int b = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (b < ar[i]) {
                b = ar[i];
                c = i;
            }
        }

        if (b != 0) {
            System.out.println(s[c].trim());
        } else {

            System.out.println("No Frequent Buyer");
        }
        System.out.println(f);
    }
}

