package sec11;

class Person {
}

class Teacher extends Person {
}

class Student extends Person {
}

public class Ex11_08 {
    public static void main(String[] args) {
        // instance: 경우, 사례
        Teacher teacher = new Teacher(); // teacher 객체는 Teacher 클래스의 인스턴스(하나의 사례)다.
        // person(teacher) 객체는 Person 클래스의 인스턴스(하나의 사례)이다.
        Person person = teacher;
        Person person2 = new Teacher();
        // animal 객체는 Animal 클래스의 인스턴스가 아님
        // Animal animal = new Teacher();

        // instanceof 연산자
        // teacher 객체는 Teacher, Person의 클래스의 인스턴스인가?
        System.out.println(teacher instanceof Teacher);
        System.out.println(teacher instanceof Person);
        // System.out.println(teacher instanceof Student);
        // System.out.println(teacher instanceof Animal);

        System.out.println("----------");

        Student student = new Student();
        System.out.println(student instanceof Person);
        // System.out.println(student instanceof Teacher); // student 객체는 teacher 객체가 아님

    }
}
