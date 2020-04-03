package FileIO_related_programs;

import java.io.IOException;

public class Read_A_Character_From_User {
    public static void main(String[] args) throws IOException {
        char a;
        a =(char) System.in.read();
        System.out.println("YOu entered " + a);
    }
}
