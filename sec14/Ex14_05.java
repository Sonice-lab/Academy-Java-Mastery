package sec14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex14_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("점수를 입력하세요: ");
            int score = scanner.nextInt();

            if (score >= 60) {
                System.out.println("합격입니다.");
            } else {
                System.out.println("불합격입니다.");
            }
        } catch (InputMismatchException e) {
            System.out.println("숫자만 입력 가능합니다.");
        }
        System.out.println("프로그램을 종료합니다.");
        scanner.close(); // InputMismatchException '육십'이라고 한글로 쳤을 때
    }
}
