package sec09;

class PersonThis {
    String name;
    int age;
    String address;

    PersonThis(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void introduce() {
        System.out.println("안녕하세요. 저는 " + address + "에 살고 있는 " + age + "세 " + name + "입니다.");
    }
}

public class Ex09_08 {
    public static void main(String[] args) {
        PersonThis p1 = new PersonThis("김일남", 99, "부산");
        // Person p2 = new Person("김이남", 98, "서울");

        p1.introduce();
        // p2.introduce();
    }
}
