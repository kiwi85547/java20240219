package ch18.lecture.p2inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class C01InputStream {
    public static void main(String[] args) {
        String fileName = "temp/test3.db";
        try {
            InputStream is = new FileInputStream(fileName);
            try (is) {
                int data1 = is.read();
                int data2 = is.read();
                int data3 = is.read();
                int data4 = is.read();// -1 리턴
                int data5 = is.read();// -1 리턴

                System.out.println("data1 = " + data1);
                System.out.println("data2 = " + data2);
                System.out.println("data3 = " + data3);
                System.out.println("data4 = " + data4);
                System.out.println("data5 = " + data5);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
