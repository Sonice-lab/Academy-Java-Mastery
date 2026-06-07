package sec14;

import java.util.Scanner;

public class Ex14_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 피제수를 0으로 나눌 경우 비정상적인 종료 발생
        // > 예외 처리가 필요함
        while (true) {// 무한루프
            System.out.println("피제수(나누어지는 숫자)를 입력하세요.: ");
            int num1 = scanner.nextInt();

            System.out.println("제수(나누는 숫자)를 입력하세요.: ");
            int num2 = scanner.nextInt();

            int result = num1 / num2;

            System.out.println("결과는: " + result);

        }
    }
}
// 10/2 비정상적인 종료 > 핸들링 가능한 예외