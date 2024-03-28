package ch18.lecture.p6file;

import java.io.File;
import java.io.IOException;

public class C03Directory {
    public static void main(String[] args) throws IOException {
        String path = "temp/folder1";
        File file = new File(path);
        System.out.println("file.exists() = " + file.exists());

        if (!file.exists()) {
            file.mkdir(); // 폴더 생성
        }

        System.out.println("file.exists() = " + file.exists());
        System.out.println("file.isDirectory() = " + file.isDirectory());
    }
}
