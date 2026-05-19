package sec02;

public class Ex02_24 {
    public static void main(String[] args) {
        //실수 > 정수
        double num1 = 1.234;
        int num2 =(int) num1;
        long num3 =(long) num1; // 왜 자동형변환이 안될까? > 실수를 정수로 바꿀때는 반드시 강제형변환을 해야한다(유실이슈)


        System.out.println(num2); //데이터가 유실됨 > 형변환은 결국 유실의 유무에 따라 결정된다.
        System.out.println(num3);

        int num4 = 99999999; //실수로 표현한 범위를 넘어섬
        // int num4 = 999;
        float num5 = num4;
        System.out.println(num4);
        System.out.println(num5); //쓰레기값 출력(동일한 4바이트이지만 표현할 수 있는 데이터 크기가 다름)
    }  
}
