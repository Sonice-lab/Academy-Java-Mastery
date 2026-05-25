package sec09;

class Phone {
    String brand;
    int series;
    String color = "검정색";

    Phone(String b, int s, String c) {
        brand = b;
        series = s;
        color = c;

    }
    // 오버로딩(과적)
    // 동일한 이름의 메서드(생성자) 추가로 정의
    // 데이터를 더 많이 실을 수 있도록 하는 것, 전달하는 매개 변수의 [타입, 개수, 순서] 다르게 부여
    // 생성자 뿐만 아니라 모든 메서드에 적용되는 개념

    Phone(String b, int s) {
        brand = b;
        series = s;
    }

    void phoneInfo() {
        System.out.println(color + " " + brand + " " + series);
    }
}

public class Ex09_04 {
    public static void main(String[] args) {
        // p1 "갤럭시", 1, "흰색"
        Phone p1 = new Phone("갤럭시", 1, "흰색");
        p1.phoneInfo();

        Phone p2 = new Phone("아이폰", 2);// 오버로딩을 쓰는 이유
        p2.phoneInfo();
    }
}
