package sec11;

class ClassA {

    void methodA() {
        System.out.println("methodA");
    }
}

class ClassB extends ClassA {
    @Override // 최우선시 되는, 자바 세계에서는 상속관계에서도 오버라이딩의 메서드가 최우선시 출력됨 > 다형성과 연결됨
    void methodA() {
        System.out.println("ClassB의 methodA");
    }

    void methodB() {// classA에는 없는 메서드
        System.out.println("methodB");
    }
}

public class Ex11_03 {
    public static void main(String[] args) {
        ClassB classB = new ClassB();
        classB.methodA();
        classB.methodB();
        System.out.println("ClassB: " + classB);

        // classA타입이지만 classA의 메서드 호출이 되는 것이 아님!(매우중요)
        ClassA classA = classB;// 자동형변환
        classA.methodA();
        System.out.println("ClassA: " + classA);
        // 2번이 출력됨 > 오버라이딩(최우선시되는) 된 메서드가 호출됨!
        // classA.methodB(); //자동형변환된 classA는 동일한 주소를 가진 동일한 객체이지만 메서드B를 가지고 올 수 없음
        // > 사용할 수 있는 기능은 다름
    } // 타입 변환의 의미: 자식클래스에서 정의한 메서드는 사용할 수 없음

}

// [매우중요][클래스 형변환 정리]
// 자식 > 부모 형변환
// - 자식 클래스에서 오버라이딩된 메서드 호출됨
// - 자식 클래스에 추가 정의한 메서드 호출 불가!
