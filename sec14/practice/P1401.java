package sec14.practice;

//결과는: Infinity > 9번 라인에 더블이 안 붙었을 때 런타임 오류를 의미, 시스템적인 오류는 아니지만...

public class P1401 {
    public static void main(String[] args) throws ArithmeticException {

        try {
            int data = 10;
            double result = 0;

            result = data / 0; // ArithmeticException > 0으로는 나눌 수 없기 때문에 발생하는 오류
            System.out.println("결과는: " + result);

        } catch (ArithmeticException e) {
            System.out.println("0으로는 나눌 수 없습니다.");
        }

    }

}
