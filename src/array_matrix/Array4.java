package array_matrix;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Array4 {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
            sum = sum + array[i];
            tree.add(array[i]);
        }

        int[] list = new int[tree.size()];
        int j = 0;
        System.out.println("Remove the duplicates");
        Iterator<Integer> i = tree.iterator();
        while (i.hasNext()) {
            int f = i.next();
            list[j] = f;
            j++;
        }

        System.out.println(Arrays.toString(list));
        System.out.println("Sum of the elemnents of array");
        System.out.print(sum);
    }
}
