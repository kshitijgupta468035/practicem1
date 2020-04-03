package COllections_Interfaces_all;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("hill");
        list.add("hill1");
        list.add("hill2");
        list.add("hill3");
        list.add("hill4");

        Iterator<String> i = list.iterator();

        while (i.hasNext()) {
            String on = i.next();
            System.out.println(on + " ");
        }
    }
}
