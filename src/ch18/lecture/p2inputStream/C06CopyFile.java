package ch18.lecture.p2inputStream;

import java.io.*;

public class C06CopyFile {
    public static void main(String[] args) {
        // temp/dog.png파일을
        // temp/dog-copy.png 파일로 복사

        String inputFileName = "temp/dog.png";
        String outputFileName = "temp/dog-copy.png";

        try {
            InputStream is = new FileInputStream(inputFileName);
            OutputStream os = new FileOutputStream(outputFileName);
            try (is; os) {

                byte[] data = new byte[10];

                int len = 0; // len 초기화
                // data.length 는 위의 byte[10]의 길이이기 때문에 항상 10개의 값을 가지고 있음.
                // 그래서 데이터를 읽은 숫자로 선언해줘야함.
                while ((len = is.read(data)) != -1) {
                    os.write(data, 0, len);
                }
                os.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
