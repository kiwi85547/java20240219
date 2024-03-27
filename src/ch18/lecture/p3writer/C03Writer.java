package ch18.lecture.p3writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C03Writer {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("temp/output3.txt");

            // 여러 메소드가 오버로딩 되어있다.
            writer.write("😜");
            writer.write(new char[]{'자', '바'});

            char[] arr = {'사', '랑', '해'};
            writer.write(arr);
            writer.write(1_0000_0000);

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
