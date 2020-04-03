package FileIO_related_programs;

import java.io.*;

public class ReaderClass {
    public static void main(String[] args) throws IOException {
        File f = new File("java.txt");

        Reader r = new FileReader(f);
        BufferedReader br = new BufferedReader(r);
        String msg;
        while ((msg = br.readLine()) != null){
            System.out.println(msg);
        }
        r.close();
    }
}
