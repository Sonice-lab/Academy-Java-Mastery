package sec13;

class Outer {
    static private int val1 = 1;
    static private int val2 = 2;

    // Outer(int val1, int val2) {
    // this.val1 = val1;
    // this.val2 = val2;
    // }

    // 정적 내부 클래스
    // 프로그램이 실행될 때 메모리에 저장되기 때문에 외부클래스의 객체가 필요없음
    static class Inner {// static을 붙임으로써 인스턴스 클래스에서 정적 클래스로 바뀜 > 저장되는 시기의 차이로 오류가 많음
        void add() {
            // 인스턴스 변수는 사용 불가
            // 정적 변수 사용 가능
            System.out.println(val1 + val2);
        }
    }
}

public class StaticClass {
    public static void main(String[] args) {
        //Outer outer = new Outer();
        // 외부 클래스의 객체가 필요 없음, 그냥 생성 가능
        Outer.Inner inner = new Outer.Inner();
        inner.add();

    }
}
