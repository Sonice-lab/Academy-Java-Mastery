package sec07;

public class Ex07_01 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);

        // System.out.println(person.name);
        // 선언을 하고 초기화 하지 않으면 오류가 생김
        // String name;

        System.out.println(person.name); // 클래스의 속성은 null로 초기화됨(string은 null)
        System.out.println(person.age);

        person.name = "김일남";
        person.age = 99;

        System.out.println(person.name);
        System.out.println(person.age);

    }
}
