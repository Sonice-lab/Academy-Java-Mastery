package sec14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex14_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // 무한 반복을 막아줌
        try { // 트라이는 파이널리와도 함께 쓸 수 있으며, 중첩해서 사용할 수 있음

            while (true) {

                try {
                    System.out.print("피제수(나누어지는 숫자)를 입력하세요.: ");
                    int num1 = scanner.nextInt();

                    System.out.print("제수(나누는 숫자)를 입력하세요.: ");
                    int num2 = scanner.nextInt();

                    int result = num1 / num2;

                    System.out.println("결과는: " + result);
                    // 다중 예외 처리
                    // - 부모 예외 클래스는 아래에 배치해야 함
                } catch (ArithmeticException e) { // 캐치는 여러번 사용할 수 있음
                    System.out.println("0으로는 나눌 수 없습니다.");
                } catch (InputMismatchException e) { // 캐치는 여러번 사용할 수 있음
                    System.out.println("숫자만 입력 가능합니다.");
                    // scanner.nextLine();// 버퍼에 남아있는 문자열을 제거하는 기능(38번 코드가 없을 때 활용 가능)
                } catch (Exception e) {
                    System.out.println("알 수 없는 예외가 발생했습니다."); // 모든 코드가 실행되려면 해당 코드는 반드시 제일 아래쪽으로 배치해야함

                    // scanner = new Scanner(System.in); // 입력하여 스캐너를 초기화함(스캐너가 while 밖에 있을 때)
                } finally { // ★중요 예외가 발생하든, 발생하지 않든 실행되는 코드
                    // scanner.close();
                    scanner = new Scanner(System.in); // 없어지만 또다른 오류 발생(예시: 문자열을 잘못 입력했을 때 오류로 인식하지 못함)

                    System.out.print("종료하시겠습니까? (y/n)");
                    String userInput = scanner.next();
                    // System.out.println(userInput.equals("y"));

                    if (userInput.equals("y")) {
                        // scanner.close();
                        break;

                        // } else {
                        // scanner.close();
                    }
                }
                // scanner = new Scanner(System.in);
                // scanner.close();
            }
        } finally { // try - finally만 사용한 경우(try 단독은 사용 불가)
            scanner.close();
        }

    }
}
