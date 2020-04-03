package FileIO_related_programs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WritterClass {
    public static void main(String[] args) throws IOException {
        File f = new File("java2.txt");
        String str = "I have a great news to tell you all guys";
        Writer w = new FileWriter(f);
        w.write(str);
        w.close();
    }
}
