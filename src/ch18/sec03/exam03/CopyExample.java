package ch18.sec03.exam03;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) {
        String originalFileName = "temp/micky.jpg";
        String targetFileName = "temp/micky-copy.jpg";

        try {
            InputStream is = new FileInputStream(originalFileName);
            OutputStream os = new FileOutputStream(targetFileName);
            try (is; os) {

                int len = 0;
                while ((len = is.read()) != -1) {
                    os.write(len);
                }
                os.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
