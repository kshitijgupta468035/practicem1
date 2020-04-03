package array_matrix;

import java.util.Arrays;
import java.util.Vector;

public class Vectot {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(24);
        vector.add(22);
        vector.add(24);
        vector.add(12);
        Integer[] new1 = new Integer[4];
        System.out.println(Arrays.toString(new1));
        Integer[] in = vector.toArray(new1);
        System.out.println(Arrays.toString(in));



    }
}

