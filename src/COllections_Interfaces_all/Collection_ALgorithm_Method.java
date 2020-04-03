package COllections_Interfaces_all;

import java.util.Collections;
import java.util.LinkedList;

public class Collection_ALgorithm_Method {
    public static void main(String[] args) {
        // Create a Linked List

        LinkedList<String> list = new LinkedList<>();

        // Add elements to the LinkedList

        list.add("DELL");
        list.add("HP");
        list.add("LENOVO");
        list.add("COMPACT");
        list.add("SONY");
        list.add("ACER");

        System.out.println("Sorting of LinkedList ");

        System.out.println("Before Sorting");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After Sorting");
        System.out.println(list);

        Collections.reverse(list);

        System.out.println("Sorting in Descending Order ");
        System.out.println(list);

        // Binary SEarch

        Collections.sort(list);

        System.out.println("BInary SEarch");

        String key = "DELL";

        int index = Collections.binarySearch(list, key);

        System.out.println("Element " + key + " is found at Index " + index);

        // Shuffle

        System.out.println("before Shuffle");
        Collections.shuffle(list);
        System.out.println("After Shuffle");
        System.out.println(list);

        // Minium Maximum
        System.out.println("Minium is " + Collections.min(list));
        System.out.println("Maximun is " + Collections.max(list));

        // Copy

        // creating an another Linked List

        LinkedList<String> list1 = new LinkedList<>();

        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");
        list1.add("F");
        list1.add("G");
        list1.add("H");
        list1.add("I");

        System.out.println("Copying ");

        Collections.copy(list1, list);

        System.out.println("After Copying");

        System.out.println(list1);

        // Fill

        System.out.println("// Filling");
        Collections.fill(list1,"&*");

        System.out.println("After Filling");
        System.out.println(list1);

    }
}
