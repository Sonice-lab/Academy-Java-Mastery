package sec10;

class ClassA {
    void methodA() {
        System.out.println("methodA 입니다.");
    }

    void methodB() {
        System.out.println("methodB 입니다.");
    }
}

// final메서드는 오버라이딩이 되지 않음
class ClassB extends ClassA {
    // @Override
    // void methodB() {
    // System.out.println("methodB입니다.");

    public static void main(String[] args) {
        ClassB classB = new ClassB();
        classB.methodA();
        classB.methodB();
    }
}

public class Ex10_08 {

}
