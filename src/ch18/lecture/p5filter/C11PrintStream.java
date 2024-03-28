package ch18.lecture.p5filter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class C11PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        String file = "temp/output11.txt";
        FileOutputStream fos = new FileOutputStream(file);
        PrintStream ps = new PrintStream(fos);

        ps.println("기분이 꿀꿀");
        ps.print("비도 온다");
        ps.println("😔");
        ps.printf("%f원", 21000.0);
        ps.close();
    }
}
