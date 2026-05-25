package sec09;

class ConstructorOverloading {
    String s;
    int a;
    int b;

    ConstructorOverloading() {
        s = "java";
        a = 1;
        b = 2;
    }

    ConstructorOverloading(String str, int intA, int intB) {
        s = str;
        a = intA;
        b = intB;
    }

    ConstructorOverloading(int intA, int intB, String str) {
        s = str;
        a = intA;
        b = intB;
    }
}
// 매개변수명이 다르더라도 자바는 위 생성자와 동일한 생성자로 간주
// ConstructorOverloading(String strNew, int intANew, int intBNew) {
// s = strNew;
// a = intANew;
// b = intBNew;
// }
// }

public class Ex09_05 {
    public static void main(String[] args) {
        ConstructorOverloading co = new ConstructorOverloading();
        System.out.println(co.s + " " + co.a + " " + co.b);

        co = new ConstructorOverloading(1, 2, "Java");
        System.out.println(co.s + " " + co.a + " " + co.b);
    }
}
