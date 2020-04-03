package COllections_Interfaces_all;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<>();

        hash.put(1, "Key");
        hash.put(2, "Key1");
        hash.put(3, "Key2");
        hash.put(4, "Key3");
        hash.put(5, "Key4");
        hash.put(6, "Key5");
        hash.put(7, "Key6");
        hash.put(8, "Key7");

        Set set = hash.entrySet();
        Iterator i = set.iterator();

        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.println("KEy " + me.getKey() + "value " + me.getValue());
        }

        System.out.println(hash);

        System.out.println(hash.get(2));

        hash.remove(1);

        System.out.println(hash);

    }
}