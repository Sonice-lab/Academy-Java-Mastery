package sec13;
// 안드로이드에서 실제로 사용하는 코드

interface ButtonClickListener {
    void click();
}

// class ButtonClickListenerClass implements ButtonClickListener {
// public void click() {
// System.out.println("클릭!!!");
// }
// }

public class AnonymousExample {

    class Button {
        private ButtonClickListener listener;

        void setButtonlistener(ButtonClickListener listener) {
            this.listener = listener;
        }

        void click() {
            if (listener != null) {
                this.listener.click();
            }
        }
    }

    public static void main(String[] args) {
        // ButtonClickListener listener = new ButtonClickListenerClass();
        AnonymousExample anonymousExample = new AnonymousExample();
        AnonymousExample.Button button = anonymousExample.new Button();
        button.setButtonlistener(
                // 익명 클래스의 객체 생성
                // 인터페이스의 생성자 호출 아님!!! > 인터페이스는 생성자가 없엄
                // 익명 클래스의 정의후 인터페이스 타입의 익명 클래스의 생성자 호출
                new ButtonClickListener() {
                    @Override
                    public void click() {
                        System.out.println("클릭!!!");

                    }
                });
        button.click(); // 여기까지 굉장히 복잡해짐, 그러하여 어나니머스 클래스를 이용
    }
}
