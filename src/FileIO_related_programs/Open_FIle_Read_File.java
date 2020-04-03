package FileIO_related_programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Open_FIle_Read_File {
    public static void main(String[] args) throws IOException {
        File f = new File("Java.txt");
        int i;
        FileInputStream fis = new FileInputStream(f);
        while (( i = fis.read()) != -1) {
            System.out.print((char) i + "");
        }

        fis.close();
    }
}
