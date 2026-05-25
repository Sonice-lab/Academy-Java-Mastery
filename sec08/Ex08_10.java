package sec08;

class Person {
    private int age; // 외부에서 필드 값을 직접 수정하지 못하게 함(캡슐화)

    // setter() 메서드
    // - 필드의 값을 수정

    void setAge(int a) {
        // this.age = age;
        // 유효성 검사
        if (a <= 0 || a > 200) {
            System.out.println("잘못된 수를 입력하셨습니다.(1~200 사이만 가능)");
            return;
        }
        age = a;
    }

    // getter() 메서드 > 필드값을 가져옴
    int getAge() {
        return age;

    }
}

public class Ex08_10 {
    public static void main(String[] args) {
        Person kim1 = new Person(); // 객체 생성

        // kim1.age = -99;

        kim1.setAge(-99);

        System.out.println("당신의 나이는" + kim1.getAge() + "세입니다.");
    }
}
