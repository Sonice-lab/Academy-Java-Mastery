package sec09; //같은 패키지에서는 같은 클래스 접근이 가능함, 생성자 호출 가능함

class Snack {
    int price;

    Snack() {
    }

    Snack(int p) {// 매개 변수가 있다라는 것을 의미, 원하는 값으로 지정 가능
        price = p;
    }

    void info() {
        System.out.println("과자의 가격은 " + price + "원입니다.");
    }
}

public class Ex09_01 {
    public static void main(String[] args) {
        // 객체 생성, 참조 변수명: chip
        // 실행결과: 과자의 가격은 2000원입니다.
        Snack chip = new Snack();
        chip.price = 2000; // 필드에다가 변수를 호출할 때

        chip.info();

    }
}
