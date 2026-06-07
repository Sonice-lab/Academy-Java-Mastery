package sec12.Practice;

abstract class Bike {
    int wheel;

    Bike(int wheel) {
        this.wheel = wheel;
    }

    // 추상메서드는 (인터페이스와는 달리)접근 제한자를 다양하게 사용 가능
    // 현재 default
    abstract int getWheel();

    void info() {
        System.out.println("이 자전거는 " + wheel + "발 자전거입니다.");
    }
}

class ChildBike extends Bike {

    ChildBike(int wheel) {
        super(wheel);

    }

    @Override
    public int getWheel() { // 퍼블릭 안붙여도 괜찮음, 클래스이기 때문에 접근제한자를 다양하게 쓸 수 있음
        return wheel;
    }
}

public class P1202 {
    public static void main(String[] args) {
        // 추상 클래스, 인터페이스는 객체 생성 불가
        Bike b = new ChildBike(2);

        ChildBike cb = new ChildBike(4);
        cb.info();
    }
}
