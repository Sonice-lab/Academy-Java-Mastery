package sec11;

class Computer {
    void powerOn() {
        System.out.println("삑~ 컴퓨터가 켜졌습니다.");
    }

    void powerOff() {
        System.out.println("컴퓨터가 종료됩니다.");
    }
}

class Samsong extends Computer { // 2. 생성자 호출
    @Override
    void powerOn() {
        super.powerOn();
        System.out.println("아이 러브 삼송🌟🌟");
    }
}

class LZ extends Computer { // 2. 생성자 호출
    @Override
    void powerOn() {
        super.powerOn();
        System.out.println("사랑해요. LZ 😆");
    }
    // void powerOff() {
    // super.powerOff();
    // System.out.println("아이 러브 삼송🌟🌟");
    // }
}

class ComputerRoom {
    Computer computer1; // 1. 참조자료형(null 상태)
    Computer computer2; // 자동형변환 > 다양성

    void allPowerOn() {
        computer1.powerOn();
        computer2.powerOn();
    }

    void allPowerOff() {
        computer1.powerOff();
        computer2.powerOff();
    }
}

public class Ex11_07 {
    public static void main(String[] args) {
        ComputerRoom computerRoom = new ComputerRoom(); // class computerRoom
        computerRoom.computer1 = new Samsong();
        computerRoom.computer2 = new LZ();

        computerRoom.allPowerOn(); // class computerRoom
        computerRoom.allPowerOff(); // class computer

    }
}
// 다양성 > 하나의 타입에 다양한 객체를 생성할 수 있음
