package ch18.sec09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("temp/printstream.txt");
        PrintStream ps = new PrintStream(fos);

        byte[] arr = {50, 51, 52};

        ps.write(33); // !
        ps.write(49); // 1
        ps.write(65); // A
        ps.write(5553);
        ps.write(arr);
        ps.println();
        ps.println("printstream");
        ps.printf("%3d원", 20000);
        ps.flush();
        ps.close();
    }
}