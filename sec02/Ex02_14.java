package sec02;


public class Ex02_14 {
    public static void main(String[] args) {
        // 부동 소수점 오차, 부동 소수점(Floating Point) > 컴퓨터에서 실수를 표현하는 방식, 10진수 > 2진수 > 10진수 로 변환시 필수적으로 발생하는 오차
        double num1 = 0.1;
        System.out.println(num1 + num1 + num1); // 0.30000000000000004
        
        //이 것을 이용하면 이러한 오차를 해결할 수 있음

        double num2 = 0.123456789012345678; // 0.123456789012345678 > 부동 소수텀 오차 때문
        System.out.println(num2); // 소수점 17자리까지 표기
        
    }
    
}
