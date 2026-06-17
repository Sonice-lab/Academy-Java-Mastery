package sec15.practice;

class User {
    private String name;
    private int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 오버라이딩을 하여 김철수, 22를 출력하도록 하기

    @Override
    public String toString() {
        return "이름: " + name + ", 나이: " + age;
    }

}

public class P1501 {
    public static void main(String[] args) {
        User user = new User("김철수", 22);
        System.out.println(user);

    }
}
