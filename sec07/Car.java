package sec07;

public class Car {

    int wheel = 4;

    // 기본 생성자 > 괄호 안에 아무것도 없음
    // 개발자가 작성하지 않아도 javac가 자동으로 추가함
    Car() {
    } // 앞에 걸어둔 부분있기 때문에 없어도 상관없음 > 상황에 따라 필요할 수 있음

    Car(int w) {
        wheel = w;
    }

    void ride() {
        System.out.println("달립니다.");

    }

}
