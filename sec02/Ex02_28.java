package sec02;

public class Ex02_28 {
    public static void main(String[] args) {
        // Tip) alt + shift + f > 코드 정렬
        double d1 = 1.2345;
        float f1 = (float) d1;
        System.out.println(f1);

        //음수 표현 범위 초과
        double d2 = 1.0e-50;
        float f2 = (float) d2;
        System.out.println(f2); //0.0
        
        // 양수 표현 범위 초과
        double d3 = 1.0e50;
        float f3 = (float) d3;
        System.out.println(f3);// Infinity

        // 소수점 자리수 처리 
        double d4 = 1.12345678901234567;
        float f4 = (float) d4;
        System.out.println(d4); // 1.1234567890123457 > 최대 16자리 표현
        System.out.println(f4);  // 1.1234568 > 8이 날아가고 7이 8이됨 > 최대 7자리 표현
    } 
}
