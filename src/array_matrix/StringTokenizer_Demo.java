package array_matrix;

import java.util.StringTokenizer;

public class StringTokenizer_Demo {
    static String str = "Hello_JAva_Programmers";
    public static void main(String[] args) {
        StringTokenizer s = new StringTokenizer(str, "_");
        while (s.hasMoreTokens()) {
            String token = s.nextToken();
            System.out.println(token + "\n");
        }

    }
}
