package sec12;

interface Microphone {
    void sing();
}

interface Speaker {
    void music();
}
// 클래스의 인터페이스 구현
// 다중 구현 가능

class BluetoothMic implements Microphone, Speaker {
    @Override
    public void sing() {
        System.out.println("마이크에 대고 노래를 부릅니다.");
    }

    @Override

    public void music() {
        System.out.println("마이크에 장착된 스피커에서 노래가 나옵니다..");
    }
}

public class Ex12_07 {
    public static void main(String[] args) {
        BluetoothMic bluetoothMic = new BluetoothMic();
        bluetoothMic.music();
        bluetoothMic.sing();

        Microphone microphone = bluetoothMic;
        microphone.sing();
        // microphone.music(); //왜 안될까? 블루투스에 있는 기능이 아니기 때문 > 인터페이스의 형변환에 대한 부분

        // 인터페이스의 형변환
        Speaker speaker = bluetoothMic;
        // speaker.sing(); // 스피커에 없는 부분이기 때문에 활성화될 수 없음
        
        speaker.music();

    }
}
