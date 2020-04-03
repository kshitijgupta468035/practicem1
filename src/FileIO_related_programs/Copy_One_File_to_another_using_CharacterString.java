package FileIO_related_programs;


import java.io.*;

public class Copy_One_File_to_another_using_CharacterString {
    public static void main(String[] args) throws IOException {
        File f1 = new File("Java.txt");
        File f2 = new File("java3.txt");

        Reader r = new FileReader(f1);
        Writer w = new FileWriter(f2);

        BufferedReader br = new BufferedReader(r);
        String msg;

        while ((msg = br.readLine()) != null) {
            w.write(msg);
        }
        w.close();
        r.close();
    }
}
