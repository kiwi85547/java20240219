package ch18.lecture.p4reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class C04Reader {
    public static void main(String[] args) {
        String file = "temp/output3.txt";
        try {
            Reader reader = new FileReader(file);
            char[] data = new char[5];
            int len = 0;
            while ((len = reader.read(data)) != -1) {
                reader.read(data);
                for (int i = 0; i < len; i++) {
                    System.out.println(data[i]);
                }
                System.out.println("Arrays.toString(data) = " + Arrays.toString(data));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
