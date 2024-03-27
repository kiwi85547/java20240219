package ch18.lecture.p5filter;

import java.io.*;

public class C01Filter {
    public static void main(String[] args) {
        try {
            // 어떤 I/O Stream을
            // 다른 I/O Stream으로 변경해서 사용할 수 있다.

            InputStream is = new FileInputStream("temp/output3.txt");

            //InputStreamReader:
            // byte stream을 character stream으로 연결
            Reader reader = new InputStreamReader(is);


            int data1 = reader.read();
            int data2 = reader.read();
            int data3 = reader.read();
            int data4 = reader.read();
            System.out.println((char) data1);
            System.out.println((char) data2);
            System.out.println((char) data3);
            System.out.println((char) data4);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
