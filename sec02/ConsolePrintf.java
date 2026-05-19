package sec02;

public class ConsolePrintf {
   public static void main(String[] args) {
    System.out.printf("Hello");
        System.out.printf(" ");
        System.out.printf("Java");

        System.out.println(); // 줄 바꿈 용도

        // [서식 지정자]
        // printf의 f는 format
        // 서식 문자
        // %d: 10진수 정수 (Integer)
        // %f: 실수 (Floating point)
        // %s: 문자열 (String)
        // %c: 문자 (Character)
        // %b: 논리형 (Boolean)
        // %n: 줄바꿈 (Newline, \n 대신 사용 권장)
        // %o: 8진수
        // %x / %X: 16진수
        System.out.printf("제 나이는 %d세 입니다.%n", 29);
        System.out.printf("제 이름은 %s 입니다.%n", "김일남");
        System.out.printf("제 몸무게는 %s 입니다.%n", "72.5"); //소수점 6자리 표기
    
   } 
}
