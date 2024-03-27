package ch18.lecture.p1outputStream;

import java.io.*;

public class C06EffectivelyFinal {
    public static void main(String[] args) throws IOException {
        String inputfileName = "temp/input5.data";
        String outputfileName = "temp/output5.data";

        // 생성할 때 checked exception이 발생하지 않는 경우 try문 밖에서 쓰기
        InputStream is = new FileInputStream(inputfileName);
        OutputStream os = new FileOutputStream(outputfileName);
        try (is; os;) {

            // try with resources 문법에 사용된 변수는 final 또는 effectively final
//            is = new FileInputStream(inputfileName); //파일 밖에서 썼던 걸 다시 할당할수는 없음
            // 읽는 작업
            is.read();
            // 쓰는 작업
            os.write(123);
        }
    }
}
