package sec11;

class Parent {
}

class Child extends Parent {
}

public class Ex11_01 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent); // 메모리상의 주소를 16진수로 표현한 것

        Child child = new Child(); // 2,3번 같은 객체
        System.out.println(child);

        Parent child2 = child; // 2,3번 같은 객체
        System.out.println(child2);

        Parent child3 = new Child(); // 자동 형변환이 되었음을 의미
        System.out.println(child3);

        // 강제형변환
        Child child4 = (Child) child3; // 4,5번은 같은 객체(동일한 주소를 가지고 있으나 타입은 다름 > 타입은 다르나 결국 같은 객체임을 의미함 > 강제형변환)
        System.out.println(child4);

        Child child5 = (Child) parent; // 예외 발생, 형변환을 할 수 없음 > 왜그럴까? > 강제 형변환은 애초부터 부모 객체(부모 생성자 호출) 타입인 경우
                                       // > 자식 타입으로 형변환할 수 없음
                                       // (자식 > 부모 객체 > 자식 타입)으로 강제 형변환인 경우는 가능)
                                       // > 자식객체(자식 생성자 호출) > 부모 타입 > 자식 타입 형변환은가능
        System.out.println(child5);

    }
}

// 강제형변환은 언제 가능한가? > 부모 타입에서 자식 타입으로 변환할 때 가능(자동형변환은 불가)
