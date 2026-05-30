package sec10;

class Computer {
    void powerOn() {
        System.out.println("삑~ 컴퓨터가 켜졌습니다.");
    }

    void powerOff() {
        System.out.println("컴퓨터가 종료됩니다.");

    }
}

class Samsong extends Computer {
    // 재정의
    // 메서드 오버라이딩(OverRiding): 최우선시 되는 > 자식 클래스의 메서드를 최우선시 한다.
    // [제약사항]
    // 부모 클래스의 메서드 이름, 매개 변수(int 등), 반환 타입(void 등)이 동일해야함
    // 접근 제한의 범위는 좁힐 수 있지만 넓힐 수 없음

    @Override // 오버라이드 된 부분인 점을 알려줄 수 있음 > 어(애)노테이션(주석)
    void powerOn() { // 디폴트 접근 제한자(예시: void 등 메서드 앞이 공백일 경우)
        System.out.println("아이 러브 삼송  ❤️  🌟");
    }

}

class LZ extends Computer {
    @Override
    // 최우선시 되는 메서드
    void powerOn() {
        super.powerOn(); // 부모 클래스에 있는 파워온을 호출한다는 의미
        System.out.println("사랑해요 LZ 😆");
    }
}

public class Ex10_04 {
    public static void main(String[] args) {
        // 미션
        // computer 객체 생성 후 컴퓨터 켜고, 끄기!
        // Computer computer = new Computer();
        // computer.powerOn();
        // computer.powerOff();

        Samsong samsong = new Samsong();
        samsong.powerOn();
        samsong.powerOff();

        LZ lz = new LZ();
        lz.powerOn();
        lz.powerOff();
    }
}
