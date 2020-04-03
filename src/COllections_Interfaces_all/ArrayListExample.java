package COllections_Interfaces_all;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println(list.add("hello"));
        list.add("ko");
        list.add("javaScript");

        System.out.println(list);

        list.remove("ko");
        System.out.println(list);

        System.out.println(list.get(0));

        list.get(0);

        System.out.println(list.contains("hello"));

        System.out.println(list.isEmpty());

        list2.add(55);
        list2.add(54);
        boolean b = list2.isEmpty();
        System.out.println(b);

        System.out.println(list2.remove(1));
        System.out.println(list);

    }
}
