package sec12;

// interface 의 접근 제한자는 public만 가능
interface I {
    // public abstract void printClassName();
    void printClassName(); // 앞의 public abstract를 생략해도 public abstract void printClassName();과 같은 의미를 가짐
}

class A implements I { // 구현해야함
    @Override
    public void printClassName() { // 퍼블릭을 명시해야함, 명시하지 않으면 디폴트로 인식함
        System.out.println("A클래스");
    }
}

class B implements I { // 구현해야함
    @Override
    public void printClassName() { // 퍼블릭을 명시해야함, 명시하지 않으면 디폴트로 인식함
        System.out.println("B클래스");
    }
}

public class Ex12_04 {
    public static void main(String[] args) {

        A a = new A();
        a.printClassName();

        B b = new B();
        b.printClassName();
    }
}
