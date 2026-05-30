package sec10.private_test;

public class PublicA {
    // private는 동일 클래스 내에서만 접근 가능
    // 외부에서는 보이지 않음 > 캡슐화
    // 주로 getter, setter 메서드와 함께 사용
    private int a;

    int getA() {
        return this.a;

    }

    void setA(int a) {
        this.a = a;
    }
}
