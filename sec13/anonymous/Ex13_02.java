package sec13.anonymous;

class Person {
    void mySelf() {
        System.out.println("나는 사람입니다.");
    }
}

public class Ex13_02 {
    public static void main(String[] args) {
        // 익명 클래스의 구조
        // 재사용이 불가함(단 한번만 사용 가능)
        Person kim1 = new Person() {
            @Override
            void mySelf() {
                System.out.println("나는 학생입니다.");
            }
        };
        kim1.mySelf();
    }
}
