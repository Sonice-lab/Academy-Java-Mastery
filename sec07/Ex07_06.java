package sec07;

class Student {
    // 정적 멤버: 프로그램이 실행될 때 > 메모리
    // 인스턴스 멤버: 객체가 생성될 때 > 메모리

    static String SchoolName; // 모든 객체가 공유

    void goToSchool() {
        System.out.println(SchoolName + "학교에 갑니다.");

    }

    static void getInfo() {

        System.out.println(SchoolName);
    }
}

public class Ex07_06 {
    public static void main(String[] args) {
        Student kim1 = new Student();

        Student.SchoolName = "코리아아이티";
        Student.getInfo();
        kim1.goToSchool();
        // kim1.getInfo();

        Student kim2 = new Student();
        // kim1.SchoolName = "코리아아이티"
        kim2.goToSchool();
        // kim2.getInfo();

    }
}
