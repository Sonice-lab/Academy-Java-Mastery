package sec02;

public class Ex02_23 {
    public static void main(String[] args) {
        //실수 > 실수 변환
        double num1 = 1.0e100; //float 형태
        float num2 = (float) num1;
        System.out.println(num1);
        System.out.println(num2); //무한대 > 실수의 표현 범위를 범으면 Infinity >  내가 사용한 타입이 표현할 수 있는 범위가 넘어갔음을 의미
        
        num1 = 1.0e-100;
        num2 = (float)num1;
        System.out.println(num1);
        System.out.println(num2); // 음수 실수의 표현 범위를 범으면 0.0으로 표현됨
        
    }
    
}
