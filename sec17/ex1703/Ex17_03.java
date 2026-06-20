package sec17.ex1703;

@FunctionalInterface // 함수형 인터페이스
interface Calc {
    int add(int x, int y);

    // int min(int x, int y); 람다식에서는 추상 메서드가 반드시 1개만 존재해야한다.
}

public class Ex17_03 {

    public static void main(String[] args) {

        // 람다(표현)식 방식
        // 익명 클래스를 람다식으로 표현!
        // 주의: 람다식에서는 추상 메서드가 반드시 1개만 존재해야한다.
        // Calc calc = (int x, int y) -> {return x + y;};
        Calc calc = (int x, int y) -> x + y;

        System.out.println(calc.add(1, 2)); // 3
    }
}
