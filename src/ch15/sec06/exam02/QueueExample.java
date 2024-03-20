package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Queue 컬렉션 생성
        Queue<Message> messageQueue = new LinkedList<>();

        // 메시지 넣기
//        messageQueue.offer("sendMail", "홍길동"); // 객체를 생성하지 않으면 왜 에러가 뜨나요?
        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSMS", "조화영"));
        messageQueue.offer(new Message("sendKakaotalk", "김수환"));
        messageQueue.offer(new Message("sendKakaotalk", "김수아"));
        messageQueue.offer(new Message("sendMail", "김재후"));


        // 메시지를 하나씩 꺼내어 처리
        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            switch (message.command) {
                case "sendMail" -> System.out.println(message.to + "님에게 메일을 보냅니다.");
                case "sendSMS" -> System.out.println(message.to + "님에게 SMS를 보냅니다.");
                case "sendKakaotalk" -> System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
            }
        }
    }
}

class Message {
    public String command;
    public String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }
}