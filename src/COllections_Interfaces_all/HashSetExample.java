package COllections_Interfaces_all;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create hashset
        HashSet set = new HashSet();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(1);
        set.add(4);
        set.add(9);
        set.add(10);

        System.out.println(set);

        System.out.println("Size of HashSET" + set.size());
        set.remove(1);
        System.out.println(set);

        set.removeAll(set);
        System.out.println(set);






    }
}
