package sec08;

class Jogger {
    String name;// 문자열과 같은 참조 타입은 null으로 출력됩니다.(초기화의 개념)

    void run() {// 1번 유형
        System.out.println("run run run!");
    }

    // 메서드릐 장점
    // 재사용성, 유지 보수성을 높여줌
    void sayName() {
        System.out.println("제 이름은 " + name + "입니다.");
    }
}

public class Ex08_03 {// 메서드(행위, 실행에 대한 부분 > 동사로 명명함) 명명규칙 - 변수는 카멜케이스로 명명한다. 변수와 동일하며 단, 동사로 시작함
    public static void main(String[] args) {
        Jogger jogger = new Jogger();
        jogger.run();
        jogger.sayName();

        jogger.name = "김일남";
        jogger.sayName();

    }
}
