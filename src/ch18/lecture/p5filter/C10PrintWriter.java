package ch18.lecture.p5filter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C10PrintWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("temp/output10.txt");
        PrintWriter pw = new PrintWriter(fw);

        pw.print("hello world");
        pw.print("💕😉");
        pw.println();
        pw.println("기분이 안좋아 흑흑");
        pw.println("주차비가 얼마야");
        pw.printf("21000원?");

        pw.close();
    }
}
