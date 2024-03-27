package ch18.lecture.p1outputStream;

import java.io.*;

public class C05TryWithResources {
    public static void main(String[] args) {
        String inputfileName = "temp/input5.data";
        String outputfileName = "temp/output5.data";

        try (InputStream is = new FileInputStream(inputfileName);
             OutputStream os = new FileOutputStream(outputfileName)) {
            // 읽는 작업
            // 쓰는 작업
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
