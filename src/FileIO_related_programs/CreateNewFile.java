package FileIO_related_programs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class CreateNewFile {
    public static void main(String[] args) throws IOException {
        File f = new File("java.txt");
        String msg = "Java is an object oriented language made by Kshitij Gupta";

        byte buffer[] = msg.getBytes();

        FileOutputStream fos = new FileOutputStream(f);

        fos.write(buffer);
        fos.close();
    }
}
