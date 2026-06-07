package sec12;

interface Usb {
    // public abstract void printClassName();
    void connectUsb(); // 앞의 public abstract를 생략해도 public abstract void printClassName();과 같은 의미를 가짐
}

class Mouse implements Usb { // 구현해야함
    @Override
    public void connectUsb() { // 퍼블릭을 명시해야함, 명시하지 않으면 디폴트로 인식함
        System.out.println("마우스가 연결되었습니다.");
    }
}

class Printer implements Usb { // 구현해야함
    @Override
    public void connectUsb() { // 퍼블릭을 명시해야함, 명시하지 않으면 디폴트로 인식함
        System.out.println("프린터가 연결되었습니다.");
    }
}

public class Ex12_05 {
    public static void main(String[] args) {
        // 인터페이스는 사용자에게 동일한 사용 방법 제공한다. > 표준화 > 예시: 프레임워크를 학습 시 웹서버를 배울 수 있는데,
        // 데이터베이스와 연동되게 되어있음, 데이터베이스 연동 회사: 오라클, 마이크로소프트, JDBC
        Usb mouse = new Mouse();
        mouse.connectUsb();
        Usb printer = new Printer();
        printer.connectUsb();

        // Mouse a = new Mouse();
        // a.connectUsb();

        // Printer b = new Printer();
        // b.connectUsb();
    }
}
