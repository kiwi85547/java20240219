package ch18.lecture.p5filter;

import java.io.*;

public class C06BufferedInputStream {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("temp/bigfile/output1.data");
        BufferedInputStream bis = new BufferedInputStream(is);

        long start = System.nanoTime();
        byte[] data = new byte[100];
        int len = 0;
        while ((len = bis.read(data)) != -1) {
            // 읽은 데이터 처리
        }
        bis.close();
        long end = System.nanoTime();
        long time = end - start;
        System.out.println("time = " + time);
    }
}
