package COllections_Interfaces_all;

import java.util.Vector;

public class Vectorexample {
    public static void main(String[] args) {
        Vector<Integer> vect = new Vector<>();
        vect.add(56);
        vect.add(34);
        vect.add(24);
        vect.add(22);

        System.out.println(vect.toString());

        boolean a = vect.isEmpty();
        System.out.println(a);

        vect.addElement(343);
        vect.addElement(34 );

        System.out.println(vect);

        System.out.println(vect.capacity());
        System.out.println(vect.size());

        vect.lastElement();
        vect.remove(0);
        vect.lastElement();

        System.out.println(vect);

        System.out.println("Real " + vect.capacity() +" " + vect.get(3) + " " + vect);


    }
}
