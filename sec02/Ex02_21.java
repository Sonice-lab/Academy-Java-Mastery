package sec02;

public class Ex02_21 {
    public static void main(String[] args) {
        // 원래는 형변환을 해주어야 하지만 자동으로 일어나는 경우도 있음(자동변환), int에서 일어남
        int num1 = 11; 
        System.out.println(num1);
        double num2 = 3.14;
        // 아래의 코드는 기존의 정수를 변환하는 코드
        double double_num1 = (double) num1; // double 타입으로 num1을 형변환
        System.out.println(double_num1);
        
        System.out.println(num1 + num2); //자동 형변환 
        System.out.println(double_num1 = num1 + num2);
        
        System.out.println(double_num1);

    }
    
}
