package sec08.Practice;

class Person {
    private int age;

    void setAge(int num) {
        age = num;

        if (num <= 0) {
            System.out.println("잘못된 수를 입력하셨습니다. 1이상의 값으로 설정하세요.");
            return;
        }

    }

    int getAge() {
        return age;

    }
}

public class P0805 {
    public static void main(String[] args) {
        Person lee = new Person();
        lee.setAge(-10); // 잘못된 수를 입력하셨습니다. 1이상의 값으로 설정하세요.
        lee.setAge(30);
        System.out.println("lee의 나이는 " + lee.getAge() + "세입니다.");
    }
}
