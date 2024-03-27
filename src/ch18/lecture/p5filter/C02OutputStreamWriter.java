package ch18.lecture.p5filter;

import java.io.*;

public class C02OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        String file = "temp/output2.txt";
        OutputStream os = new FileOutputStream(file);

        OutputStreamWriter osw = new OutputStreamWriter(os);

        char c1 = 'a';
//        os.write(c1);
        osw.write(c1);

        char c2 = '가';
//        os.write(c2);
        osw.write(c2);

        os.close();
    }
}
