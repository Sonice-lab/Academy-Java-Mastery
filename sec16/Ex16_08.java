package sec16;

import java.util.HashSet;
import java.util.Set;

class TextMessage {
    private int msgNumber;
    private String msg;

    TextMessage(int msgNumber, String msg) {

        this.msgNumber = msgNumber;
        this.msg = msg;
    }

    int getMsgNumber() {
        return msgNumber;
    }

    String getMsg() {
        return msg;
    }

    @Override
    public int hashCode() {
        return msgNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TextMessage) {
            TextMessage compare = (TextMessage) obj;

            if (this.msg.equals(compare.getMsg())) {
                return true;
            } else {
                return false;
            }

        }
        return false;
    }// 동일한 객체 하나로 출력하게 하기 위한 오버라이딩 처리 1. hashCode 2. equals

}

public class Ex16_08 {
    public static void main(String[] args) {
        Set<TextMessage> msgSet = new HashSet<>();

        System.out.println(msgSet);

        msgSet.add(new TextMessage(1, "안녕"));
        msgSet.add(new TextMessage(1, "안녕")); // 출력한 2객체는 주소가 다른 객체이다. 즉 다른 객체임.
        msgSet.add(new TextMessage(2, "안녕")); // 출력한 2객체는 주소가 다른 객체이다. 즉 다른 객체임.

        System.out.println(msgSet);
    }
}
