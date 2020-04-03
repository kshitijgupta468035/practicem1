package COllections_Interfaces_all;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>();
        tree.add("go");
        tree.add("bye");
        tree.add("go");
        tree.add("bue");
        tree.add("buk");

        System.out.println(tree);
        tree.remove("buk");

        System.out.println(tree.first());
        System.out.println(tree.last());

        System.out.println(tree);

        System.out.println(tree.isEmpty());

        System.out.println(tree.iterator());

        System.out.println(tree);


    }
}
