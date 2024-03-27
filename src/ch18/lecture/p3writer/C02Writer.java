package ch18.lecture.p3writer;

import java.io.*;

public class C02Writer {
    public static void main(String[] args) {
        // Writer : 문자 단위 출력 스트림

        // 강사님 설명 다시 듣기. 유니코드 부분
        // '한','z' 쓰는 것
        String fileName = "temp/output2.txt";

//        OutputStream os = new FileOutputStream(fileName);

        try {
            Writer writer = new FileWriter(fileName);

            writer.write(44145); //4바이트 중 2바이트만 쓴다.
            writer.write('한');
            writer.write('z');
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
