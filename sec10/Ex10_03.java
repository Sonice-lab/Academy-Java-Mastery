package sec10;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Customer extends Person {
    int memberId;

    Customer(String name, int age, int memberId) {
        super(name, age);
        this.memberId = memberId;

    }

    void enter() {
        System.out.printf("회원 번호: %d (%s, %d세) 님 입장하셨습니다.%n", memberId, name, age);
    }
}

public class Ex10_03 {
    public static void main(String[] args) {
        // Person kim1 = new Person("김일남", 99);
        // System.out.println(kim1.name);
        // System.out.println(kim1.age);

        Customer kim1 = new Customer("김일남", 99, 1);
        kim1.enter();

        Customer kim2 = new Customer("김이남", 18, 2);
        kim2.enter();

    }
}
