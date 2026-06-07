package sec12;

// 추상 메서드
// abstract를 사용하여 선언 > 구현부 없음
// 자식 클래스가 반드시 구현해야 함 > 가이드라인 제공

abstract class Animal {// 추상 클래스 안에 추상 메서드가 있음을 의미
    abstract void cry(); // 동물이 운다는 것만 지정 > 강제로 가이드라인을 지정한다는 의미이며, 자식 클래스에서 세부 내용을 지정(구현)한다.
}

// 추상클래스
// 추상 메서드가 1개 이상 있으면 반드시 abstract를 사용하여 추상 클래스로 정의해야 한다.
class Dog extends Animal {
    @Override
    void cry() {
        System.out.println("멍멍");
    }

}

class Cat extends Animal {
    @Override
    void cry() {
        System.out.println("야옹야옹");
    }

}

public class Ex12_01 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.cry();

        Animal cat = new Cat();
        cat.cry();

    }
}
