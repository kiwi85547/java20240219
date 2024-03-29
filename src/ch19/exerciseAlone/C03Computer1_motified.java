package ch19.exerciseAlone;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class C03Computer1_motified {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9000);
        Socket socket = serverSocket.accept();

        try (socket) {
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw);

            Scanner scanner = new Scanner(System.in);

            try (is; isr; br; os; osw; bw; pw; scanner) {

                while (true) {
                    System.out.println("입력하세요>");
                    String data = scanner.nextLine();
                    pw.println(data);
                    if (data.equals("bye")) {
                        break;
                    }
                    pw.flush();

                    String receiveLine = br.readLine();
                    System.out.println("메시지: " + receiveLine);

                }
            }
        }
    }
}
