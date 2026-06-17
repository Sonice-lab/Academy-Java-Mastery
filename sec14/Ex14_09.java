package sec14;

import java.util.Scanner;

//유효성 검사 > 데이터가 유효한가?
public class Ex14_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            int age;

            System.out.print("나이를 입력하세요.: ");
            age = scanner.nextInt();
            if (age <= 0) {
                // throw 이용해 고의로 (의도적으로) 예외 일으키기!
                // 사용자의 입력이 유효한지 확인 > 유효성 검사
                throw new Exception("잘못된 입력입니다."); // 컴파일 단계에서 오류(런타임 오류x)
            }
            System.out.println("당신의 나이는 " + age + "세 입니다.");

            scanner.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());// 메세지만 보이도록 하는 명령어
        } finally {
            scanner.close();
        }

    }
}
