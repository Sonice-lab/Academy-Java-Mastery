package sec13.normal;

class Person {
    void mySelf() {
        System.out.println("나는 사람입니다.");
    }
}

class Student extends Person {
    @Override
    void mySelf() {
        System.out.println("나는 학생입니다.");
    }
}

public class Ex13_01 {
    public static void main(String[] args) {
        Student kim1 = new Student();
        kim1.mySelf();
    }
}
