package sec17.ex1702;

interface Calc {
    int add(int x, int y); // 인터페이스가 2개 이상일 수 있음
    // int min(int x, int y); // 인터페이스가 2개 이상일 수 있음
}

public class Ex17_02 {

    // int add(int x, int y) {
    // return x + y;
    // }

    public static void main(String[] args) {
        // Ex17_01 example = new Ex17_01();
        // System.out.println(example.add(1, 2));

        // 익명클래스 방식
        Calc calc = new Calc() {
            public int add(int x, int y) {
                return x + y;
            }
        };
        System.out.println(calc.add(1, 2)); // 3

    }

}
