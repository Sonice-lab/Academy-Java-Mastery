package sec10.practice;

class ClassA {
    private int a;

    ClassA() {
        this.a = 1;
    }

    ClassA(int a) {
        this.a = a;
    }

    public void methodA() {
        System.out.println("ClassA클래스 methodA()메서드입니다.");
        System.out.println("필드 a의 값은 " + a + "입니다.");
    }
}

public class P1004 {
    public static void main(String[] args) {
        ClassA classA = new ClassA(1);
        classA.methodA();
    }
}

// private를 없애주거나, 생성자를 생성함
