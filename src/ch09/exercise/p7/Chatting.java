package ch09.exercise.p7;

public class Chatting {
    class Chat {
        void start() {
        }

        void sendMessage(String message) {
        }
    }

    void startChat(String chatId) {
        String nickName = null;
        nickName = chatId;

        String finalNickName = nickName;
        Chat chat = new Chat() {
            // 로컬클래스. 메소드 안에서 지역변수나 파라미터는 final, effectively final
            @Override
            public void start() {
                while (true) {
                    String inputData = "안녕하세요";
                    String message = "[" + finalNickName + "]" + inputData;
                    sendMessage(message);
                }
            }
        };
        chat.start();
    }
}
