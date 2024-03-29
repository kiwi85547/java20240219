package ch19.lecture.p1network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C01Computer1 {
    public static void main(String[] args) throws IOException {
        // 연결을 기다리는 쪽
        ServerSocket serverSocket = new ServerSocket(9000);
        // socket 생성. 연결이 되면 소켓이 만들어짐..?
        Socket socket = serverSocket.accept(); // 연결 요구하기를 기다림

        // 출력스트림 데코레이팅...
        // 처음부터 문자단위로 꺼내는 메소드가 없음
        try (socket) {
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw);

            try (os; osw; bw; pw) {
                pw.println("hello world");
                pw.println("java");
                pw.println("안녕하세요");
            }
        } catch (IOException e) {

        }
    }
}
