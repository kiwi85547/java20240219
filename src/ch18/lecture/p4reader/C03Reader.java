package ch18.lecture.p4reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class C03Reader {
    public static void main(String[] args) {
        String file = "temp/output3.txt";
        // 이모티콘은 3바이트

        try {
            Reader reader = new FileReader(file);
            char[] data = new char[5];
            int len1 = reader.read(data); // 5 리턴
            System.out.println(Arrays.toString(data));
            System.out.println("len1 = " + len1);
            reader.read(data); // 5 리턴
            System.out.println(Arrays.toString(data));
            int len2 = reader.read(data); // -1 리턴. 더이상 읽을것이 없으므로
            System.out.println(Arrays.toString(data));
            System.out.println("len2 = " + len2);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
