package sec13;

//클래스를 정의할 때 내부에도 클래스를 정의할 수 있다.
class Calculator {
    private int val1;
    private int val2;

    Calculator(int val1, int val2) {
        this.val1 = val1;
        this.val2 = val2;

    }

    // 인스턴스 내부 클래스의 구조
    // 객체(인스턴스)가 생성되어야 사용할 수 있음
    class Calc {
        // 내부 클래스는 외부 클래스의 구성 요소에 접근 가능
        int add() {
            return val1 + val2;
        }
    }
}

public class CalculatorExample {
    public static void main(String[] args) {
        // 인스턴스 내부 클래스는 부모 클래서 객체 없이 객체 생성 불가함
        // 1. 부모 클래스 객체 생성
        Calculator cal = new Calculator(4, 6);
        // 2. 내부 클래스 객체 생성 > 내부 클래스를 바로 1.의 과정을 건너뛰고 생성할 수 없음
        Calculator.Calc calc = cal.new Calc();
        System.out.println(calc.add());
    }
}
