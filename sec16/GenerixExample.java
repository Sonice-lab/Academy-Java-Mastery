package sec16;

class ClassInt {
    private int element;

    void set(int element) {
        this.element = element;
    }

    int get() {
        return this.element;
    }
}

class ClassString {
    private String element;

    void set(String element) {
        this.element = element;
    }

    String get() {
        return this.element;
    }
}

class ClassDouble {
    private double element;

    void set(double element) {
        this.element = element;
    }

    double get() {
        return this.element;
    }
}

// Generic(제네릭)
// 포괄적인 자료형 사용이 목적
// 타입 변수
// - T : Type
// - E : Element(컬렉션 프레임워크 내 값을 요소하고 부름)
// - K : key
// - N : Number
// - V : Value
class ClassGeneric<E> { // 객체가 생성될 때 타입이 결정됨
    private E element;

    void set(E element) {
        this.element = element;
    }

    E get() {
        return this.element;
    }
}

public class GenerixExample {
    public static void main(String[] args) {
        ClassInt classInt = new ClassInt();
        classInt.set(1);
        System.out.println(classInt.get());

        System.out.println("---");

        ClassString classString = new ClassString();
        classString.set("Java");
        System.out.println(classString.get());

        System.out.println("---");

        ClassDouble classDouble = new ClassDouble();
        classDouble.set(0.123);
        System.out.println(classDouble.get());

        System.out.println("--- 이하 제네릭");

        ClassGeneric<Integer> genericInt = new ClassGeneric<>(); // 뒤의<>안의 내용은 생략 가능
        genericInt.set(1);
        System.out.println(genericInt.get());

        ClassGeneric<String> genericStr = new ClassGeneric<>(); // 뒤의<>안의 내용은 생략 가능
        genericStr.set("Java");
        System.out.println(genericStr.get());

        ClassGeneric<Double> genericDouble = new ClassGeneric<>(); // 뒤의<>안의 내용은 생략 가능
        genericDouble.set(0.123);
        System.out.println(genericDouble.get());
    }
}
