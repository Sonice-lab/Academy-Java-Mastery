package sec15;

public class Ex15_11 {
    public static void main(String[] args) {
        double num = 0.123456789;
        System.out.println(Math.ceil(num)); // 1.0, 무조건 올림
        System.out.println(Math.floor(num)); // 0.0, 무조건 내림
        System.out.println(Math.round(num)); // 0 > 반환값이 정수(int) 타입이라 0으로 변환됨, 반올림

        System.out.println((double) Math.round(num * 100) / 100); // 0.12
        System.out.println((double) Math.round(num * 10000) / 10000); // 0.1235

        System.out.println(Math.abs(-99));// 절대값으로 처리
        System.out.println(Math.max(1, 2));
        System.out.println(Math.min(1, 2));

        System.out.println(Math.max(1, Math.max(2, 3))); // 매개 변수가 3개 이상일 경우
        System.out.println(Math.max(1, Math.max(2, Math.max(3, 4)))); // 매개 변수가 4개 이상일 경우
    }
}
