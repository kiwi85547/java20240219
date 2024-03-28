package ch18.exercise.p10;

import java.io.*;

public class p10 {
    public static void main(String[] args) throws IOException {
        // 1. 원본파일 경로 입력
        // 2. 복사파일 경로 입력
        // 3. 원본파일 복사
        //  3-1 만약 원본파일이 없다면 원본파일 존재안함 출력
        //  3-2 복사경로에 디렉토리가 없다면 디렉토리 생성
        //  3-3 복사성공시 복사성공 출력

        // 1. 입력스트림 선언
        // 2. 원본 파일 경로 입력->저장
        // 3. 복사 파일 경로 입력->저장
        // 4. if(원본파일존재){}else{존재안함}


        // 파일 경로 받기
        String originalPath = "";
        String copyPath = "";

//        InputStream keyboard = System.in;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);


        System.out.print("원본 파일 경로 : ");
        originalPath = br.readLine();
        File file = new File(originalPath);

        System.out.print("복사 파일 경로 : ");
        copyPath = br.readLine();
        File file2 = new File(copyPath);

        OutputStream os = new FileOutputStream(file2);
        BufferedOutputStream bos = new BufferedOutputStream(os);

        if (!file.exists()) {
            System.out.println("원본 파일이 존재하지 않습니다.");
        } else if (!file.isDirectory()) {
            file.mkdirs();
            byte[] data = new byte[100];
            int len = 0;
            while ((len = br.read()) != -1) {
                bos.write(data, 0, len);
            }
            bos.flush();
            bos.close();
            System.out.println("복사가 성공되었습니다.");

        } else {

            byte[] data = new byte[100];
            int len = 0;
            while ((len = br.read()) != -1) {
                bos.write(data, 0, len);
            }
            bos.flush();
            bos.close();
            System.out.println("복사가 성공되었습니다.");
        }

    }
}
