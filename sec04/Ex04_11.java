package sec04;

import java.util.Scanner;

public class Ex04_11 {
    public static void main(String[] args) {
        System.out.println("2026년 5월 요일 출력기");

        Scanner scanner = new Scanner(System.in);
        System.out.print("날짜를 입력하세요");

        int date = scanner.nextInt();

        // 1. 입력받은 날짜가 1~31일 사이인지 확인하는 조건문 (유효성 검사)
        if (date >= 1 && date <= 31) {
           
            // 2. 입력받은 날짜를 7로 나눈 나머지 값을 조건으로 사용
            switch (date % 7) {
                case 1:
                    System.out.println(date + "일은 금요일입니다.");
                    break;
                case 2:
                    System.out.println(date + "일은 토요일입니다.");
                    break;
                case 3:
                    System.out.println(date + "일은 일요일입니다.");
                    break;
                case 4:
                    System.out.println(date + "일은 월요일입니다.");
                    break;
                case 5:
                    System.out.println(date + "일은 화요일입니다.");
                    break;
                case 6:
                    System.out.println(date + "일은 수요일입니다.");
                    break;
                case 0: // 7, 14, 21, 28일처럼 7로 나누어 떨어지는 경우
                    System.out.println(date + "일은 목요일입니다.");
                    break;
            }
           
        } else {
            // 1~31 이외의 숫자를 입력했을 때의 예외 처리
            System.out.println("잘못된 날짜입니다. 1에서 31 사이의 숫자를 입력해주세요.");
        }
       
        scanner.close(); // 스캐너 종료

    }      
}
