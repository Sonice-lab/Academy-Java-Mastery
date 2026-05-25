package sec08.Practice;

class Student {
    void introduce(String name) {
        // String introduce;
        System.out.println("안녕하세요, 제 이름은 " + name + "입니다.");

    }
}

public class P0803 {
    public static void main(String[] args) {
        Student student = new Student();
        student.introduce("철수"); // > 안녕하세요, 제 이름은 철수입니다.
        student.introduce("영희"); // > 안녕하세요, 제 이름은 영희입니다.
    }
}
