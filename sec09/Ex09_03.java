package sec09;

class Person {
    String name;
    int age;
    String address;

    Person(String n, int a, String adr) {
        name = n;
        age = a;
        address = adr;
    }

    void introduce() {
        System.out.println("안녕하세요. 저는 " + address + "에 살고 있는" + age + "세 " + name + "입니다.");
    }
}

public class Ex09_03 {
    public static void main(String[] args) {
        Person p1 = new Person("김일남", 99, "부산");
        Person p2 = new Person("김이남", 98, "서울");

        p1.introduce();
        p2.introduce();
    }
}
