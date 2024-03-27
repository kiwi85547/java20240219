package ch18.lecture.p4reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C01Reader {
    public static void main(String[] args) throws IOException {
        // InputStream : 바이트 단위 입력 스트림
        // Reader : 문자 단위 입력 스트림

        Reader reader = new FileReader("temp/output2.txt");
        int read1 = reader.read();
        int read2 = reader.read();
        int read3 = reader.read();

        // int 리턴. 읽은 문자 하나를 리턴.
        // 2바이트를 포함하고 있는 4바이트를 리턴. 나머지는 0

        System.out.println("read1 = " + read1); // int타입
        System.out.println("read2 = " + read2); // int타입
        System.out.println("read3 = " + read3); // int타입

        System.out.println("read1 = " + (char) read1); // char타입
        System.out.println("read2 = " + (char) read2); // char타입
        System.out.println("read3 = " + (char) read3); // char타입


    }
}
