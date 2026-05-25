package sec08;

public class Ex08_02 {// 유형: 반환값 x, 매개 변수(인자) x
    static void method1() {
        System.out.println("1. 반환값 x, 매개 변수 x");
    }

    static String method2() {
        return ("2. 반환값 o, 매개 변수 x");// 값을 되돌려주다, 괄호 없어도됨
    }

    static void method3(String param) {// 반환값이 없기 때문에 보이드를 사용
        System.out.println(param);// 값을 되돌려주다, 괄호 없어도됨, 3. 반환값 x, 매개 변수 o
    }

    // 4. 반환값 o, 매개 변수 o
    static String method4(String param) {
        return (param);
    }

    public static void main(String[] args) {
        // System.out.println(Ex08_02.method1());//반환값이 없기 때문에 해당 코딩은 유효하지 않음, 인자로 전달 불가
        Ex08_02.method1();

        String result = Ex08_02.method2();
        System.out.println(result);// 반환값이 있기 때문에 result를 부여해야함(매개 변수는 여러개를 쓸 수 있음)

        Ex08_02.method3("3. 반환값 x, 매개 변수 o");

        result = Ex08_02.method4("4. 반환값 o, 매개 변수 o");
        System.out.println(result);

    }

}
