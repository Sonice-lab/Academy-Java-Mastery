package sec15;

//import sec04.Practice.p0407;

class Person { // Object 클래스 타입 객체로 자동 형변환
    // 자바에서 모든 클래스 Object 클래스를 상속함

}

public class Ex15_01 {
    public static void main(String[] args) {
        Person p = new Person();
        Object o = p;
        System.out.println(o);
    }
}
