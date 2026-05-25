package sec09;

class Student {
    String name;
    int age;
    int StudentNumber;
    // 자바는 모호한 것을 싫어함

    Student(String name, int age, int StudentNumber) {
        // 초기값이 출력되어벌임 > 그래서 this.을 붙여서 무얼(어떤 필드)을 명시하는 것인지 정확하게 인지시켜 주어야 함
        // this는 클래스의 구성요소(필드, 메서드)를 가리킴
        this.name = name;
        this.age = age;
        this.StudentNumber = StudentNumber;
    }

    void info() {
        System.out.println("학생명: " + name);
        System.out.println("나이: " + age);
        System.out.println("학번: " + StudentNumber);
    }
}

public class Ex09_07 {
    public static void main(String[] args) {
        // 매개변수명과 필드명을 동일하게 사용하는 방법
        Student kim1 = new Student("김일남", 99, 1);
        kim1.info();
    }
}
