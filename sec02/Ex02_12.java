package sec02;

public class Ex02_12 {
    public static void main(String[] args) {
        // 진수별 리트럴(literal) 값 작성법
        byte num1 = 0b1001001; // 0b 이진수
        System.out.println(num1);

        byte num2 = 0107; // 0으로 시작하면 8진수 
        System.out.println(num2);

        byte num3 = 0x46; // 0x로 시작하면 16진수(hex) 
        System.out.println(num3);

        //리트럴의 기본 타입은 int

        long num4 = 69L; // L은 long 타입, 소문자로 적어도 문제 없음, 소문자로 쓰면 숫자 1로 보임, 표기의 모호성(오해의 소지)이 있기 때문에 대문자로 사용하기 
        System.out.println(num4);
    }
    
}
