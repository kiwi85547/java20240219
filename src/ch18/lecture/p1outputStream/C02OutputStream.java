package ch18.lecture.p1outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C02OutputStream {
    public static void main(String[] args) throws IOException, InterruptedException {
        OutputStream os = new FileOutputStream("temp/output2.data");

        os.write(24561);
        os.write(1223);

        Thread.sleep(10_000);

        os.write(4564);
        os.write(45666333);

        os.flush(); // 아직 스트림에 출력되지 않은 데이터들을 강제 출력시키는 메소드
        os.close(); // 스트림을 열었으면 꼭 닫아주는 메소드를 꼭 작성해야 함


    }
}
