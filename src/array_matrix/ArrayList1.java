package array_matrix;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator<Integer> e = list.iterator();
        while (e.hasNext()) {
            int s =  e.next();
            System.out.println(s);
        }
    }
}
