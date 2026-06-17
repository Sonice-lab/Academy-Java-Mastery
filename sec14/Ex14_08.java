package sec14;

import java.util.InputMismatchException;
import java.util.Scanner;

class ThrowsExceptionExample {
    void checkYourSelf(Scanner scanner) throws InputMismatchException { // 일단 동작하는데는 문제가 없음 throws를 해두면 try catch를 쓰지
                                                                        // 않아도 문제가 없음
                                                                        // throws는 예외 처리를 이 메서드를 호출하는 쪽에서 하도록 가이드하는 역할
                                                                        // 가이드에 따라 예외 처리를 하지 않아도 실행 가능
                                                                        // 하지만 throws가 명시되어 있다면 호출하는 쪽에서 반드시 예외 처리 할 것!
        System.out.println("1. 사람과 어울리는 것이 좋다. 2. 혼자 있는 것이 좋다.");
        System.out.print("선택>> ");

        // try {
        int check = scanner.nextInt(); // 정수형을 전달해야하는데 문자열

        if (check == 1) {
            System.out.println("당신은 ENTP");

        } else {
            System.out.println("당신은 ISFP");
        }
        // } catch (InputMismatchException e) {
        // System.out.println("숫자만 입력할 수 있습니다.");
        // }

    }
}

public class Ex14_08 {
    public static void main(String[] args) {
        try {
            ThrowsExceptionExample example = new ThrowsExceptionExample();

            example.checkYourSelf(new Scanner(System.in));
        } catch (InputMismatchException e) {
            System.out.println("숫자만 입력할 수 있습니다.");
        }
    }
}
