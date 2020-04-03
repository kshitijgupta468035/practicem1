package FileIO_related_programs;

import java.io.*;

public class Copying_One_file_data_to_another_Using_Stream {
    public static void main(String[] args) throws IOException {
        File f1 = new File("java.txt");
        File f2 = new File("java2.txt");

        InputStream fis = new FileInputStream(f1);
        OutputStream fos = new FileOutputStream(f2);

        int i;
        while ((i = fis.read()) != -1) {
            fos.write(i);
        }
        fis.close();
        fos.close();
    }
}
