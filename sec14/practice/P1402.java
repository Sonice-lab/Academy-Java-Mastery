package sec14.practice;

import java.util.Scanner;

public class P1402 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0; // 변경
        int data = 0;
        int sum = 0;
        // 사용자가 마이너스를 입력했을 때 sum에 입력되지 않도록 하기, 음수를 입력했을 때는 다시 입력하도록 처리하기
        while (count < 5) { // 0,1,2,3,4총 5번 카운트
            try {
                System.out.print("숫자로 입력하세요: ");
                data = scanner.nextInt();
                if (data < 0) {
                    throw new Exception("음수는 입력할 수 없습니다.");
                }
                sum += data;
                count++; // 추가
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        System.out.println("숫자합: " + sum);
        scanner.close();
    }
}