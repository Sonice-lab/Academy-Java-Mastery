package sec12.inheritance;

interface Microphone {
    void sing();
}

interface Speaker {
    void music();
}

// 인터페이스의 다중 상속
// 주의: 클래스는 다중 상속이 불가하지만 인터페이스는 가능

interface BluetoothMic extends Microphone, Speaker {
    void connect();// 추상 메서드 추가

}

class TJmic implements BluetoothMic {
    @Override
    public void sing() {
        System.out.println("마이크에 대고 노래를 부릅니다.");
    }

    @Override
    public void music() {
        System.out.println("마이크에 장착된 스피커로 반주가 나옵니다.");
    }

    @Override
    public void connect() {
        System.out.println("핸드폰과 블루투스 연결이 되었습니다.");
    }
}

public class Ex12_08 {
    public static void main(String[] args) {
        // 인터페이스는 객체 생성 불가
        // BluetoothMic bluetoothMic = new BluetoothMic();
        BluetoothMic bluetoothMic = new TJmic();
        bluetoothMic.connect();
        bluetoothMic.music();
        bluetoothMic.sing();

    }
}
