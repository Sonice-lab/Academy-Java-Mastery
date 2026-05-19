package sec02;

public class Ex02_22 {
    public static void main(String[] args) {
        int num1 = 10; //정수 > 정수의 변환
        byte num2 = (byte) num1; //강제 형변환(byte) > 데이터 유실을 감안하고 진행하겠다는 의미
        System.out.println(num2);

        num1 = 127;
        num2 = (byte) num1; //btte 타입 표현 범위 넘어버림 > 쓰레기 값 발샐
        System.out.println(num2);
    }
    
}
