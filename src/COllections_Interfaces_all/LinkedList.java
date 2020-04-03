package COllections_Interfaces_all;

import java.util.LinkedList;

class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Double> link = new LinkedList<>();
        link.add(23.21);
        link.addFirst(122.2);
        link.addLast(345.45);
        link.add(2.2);

        System.out.println(link);
        System.out.println("LinkedList " + link.size() + link);

        System.out.println(link.peekFirst());
        System.out.println(link.lastIndexOf(122.2));

        System.out.println(link.remove(1));

        System.out.println(link);
        link.remove();
        link.removeFirst();

        System.out.println(link);
    }
}
