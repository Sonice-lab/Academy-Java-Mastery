package sec10;

class Parent { // final class Parent final 클래스는 자식을 만들 수 없기 때문에 다른 클래스에 상속되지 않음

}

class Child extends Parent {

}

public class Ex10_07 {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
