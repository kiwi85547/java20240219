package ch18.lecture.p5filter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class C07BufferedReader {
    public static void main(String[] args) throws IOException {
        String file = "src/ch18/lecture/p5filter/C07BufferedReader.java";
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line1 = br.readLine();
        br.readLine();

        String line = null;

        while ((line = br.readLine()) != null) {
            System.out.println("line = " + line);
        }


        System.out.println("line1 = " + line1);


        br.close();

    }
}
