package ch19.lecture.p1network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C07HttpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9000);
        Socket socket = serverSocket.accept();

        try (socket) {
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw);

            try (os; osw; bw; pw) {
                String body = """
                        <html>
                            <head>
                                <title> 직접 만든 코드 </title>
                            </head>
                            <body>
                                <h1>SERVER 만들기</h1>
                                <h2>3월29일 금요일</h2>
                                <p>햄버거 프랜차이즈</p>
                                <ul>
                                    <li>버거킹</li>
                                    <li>맥도날드</li>
                                    <li>롯데리아</li>
                                </ul>
                            </body>
                        </html>
                        """;


                pw.println("HTTP/1.1");

                pw.println("content-type :text/html; charset=utf-8");
                pw.println("content-length : " + body.getBytes().length);

                pw.println();

                pw.println(body);

                pw.flush();
            }
        }
    }
}
