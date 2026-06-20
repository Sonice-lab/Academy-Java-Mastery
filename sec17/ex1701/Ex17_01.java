package sec17.ex1701;

interface Calc {
    int add(int x, int y);

}

// 인터페이스 구현 방식
class Calculation implements Calc {
    public int add(int x, int y) {
        return x + y;
    }
}

public class Ex17_01 {

    // int add(int x, int y) {
    // return x + y;
    // }

    public static void main(String[] args) {
        // Ex17_01 example = new Ex17_01();
        // System.out.println(example.add(1, 2));
        Calc calc = new Calculation();
        System.out.println(calc.add(1, 2));

    }

}
