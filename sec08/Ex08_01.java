package sec08;

public class Ex08_01 {
    public static void main(String[] args) {

        Ex08_01.printHelloStatic();

        Ex08_01 a = new Ex08_01();
        a.printHelloInstance();

        // 1. 객체 생성
        // Ex08_01 a = new Ex08_01();
        // a.printHello();

    }

    void printHello() {
        System.out.println("안녕하세요!");
    }

    static void printHelloStatic() {
        System.out.println("정적 메서드입니다!");
    }

    void printHelloInstance() {
        System.out.println("인스턴드 메서드입니다.!");

    }
}
