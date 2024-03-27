package ch18.lecture.p4reader;

import java.io.*;

public class C05CopyCode {
    public static void main(String[] args) {
        // C05CopyCode.java 파일을
        // temp/C05CopyCode.txt 파일로 복사

        // Reader, Writer 활용
        String src = "src/ch18/lecture/p4reader/C05CopyCode.java";
        String des = "temp/C05CopyCode.txt";

        try (Reader reader = new FileReader(src);
             Writer writer = new FileWriter(des)) {

            char[] data = new char[100];
            int len = 0; // len 만들어야함.
            while ((len = reader.read(data)) != -1) {
                writer.write(data, 0, len); // len까지라고 쓰지 않으면 마지막 남은 배열까지 읽어와버림.
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}