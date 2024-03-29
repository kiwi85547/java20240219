package ch19.lecture.p1network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class C08HttpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9000);

        while (true) {
            final Socket socket = serverSocket.accept();

            Runnable runnable = new Runnable() {
                public void run() {
                    try (socket) {
                        OutputStream os = socket.getOutputStream();
                        OutputStreamWriter osw = new OutputStreamWriter(os);
                        BufferedWriter bw = new BufferedWriter(osw);
                        PrintWriter pw = new PrintWriter(bw);

                        SocketAddress client = socket.getRemoteSocketAddress();
                        String clientAddress = client.toString();

                        try (os; osw; bw; pw) {
                            String body = """
                                    <html>
                                        <head>
                                            <title> 직접 만든 코드 </title>
                                        </head>
                                        <body>
                                            <h1>SERVER 동작 체험하기</h1>
                                            <h2>3월29일 금요일</h2>
                                            <p> 내 ip : 
                                            """ + clientAddress +
                                    """
                                                    </p>
                                                    <p>커피 종류</p>
                                                    <ul>
                                                        <li>에스프레소</li>
                                                        <li>아메리카노</li>
                                                        <li>카페라떼</li>
                                                        <li>카푸치노</li>
                                                        <li>그린티라떼</li>
                                                    </ul>
                                                </body>
                                            </html>
                                            """;

                            // 첫번째 줄
                            pw.println("HTTP/1.1");

                            // 두번째 줄
                            pw.println("content-type :text/html; charset=utf-8");
                            pw.println("content-length : " + body.getBytes().length);

                            // 한 줄 띄우고
                            pw.println();

                            // 본문
                            pw.println(body);

                            pw.flush();
                        }
                    } catch (IOException e) {
                        System.err.println("에러발생");
                    }
                }
            };

            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}
