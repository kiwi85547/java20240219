package ch18.lecture.p1outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C03Close {
    public static void main(String[] args) {
        String filename = "temp/output3.data";

        OutputStream os = null;
        try {
            os = new FileOutputStream(filename);
            // 데이터 출력 작업
            os.write(226666666);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                os.close(); // 꼭 해야함! finally블럭에 있으면 좋음
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
