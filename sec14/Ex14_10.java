package sec14;

import java.util.Scanner;

//사용자 정의 예외 클래스 > 자바에 없는 클래스를 정의하여 사용할 수 있다. 
class AgeErrorException extends Exception {
    private String message;

    AgeErrorException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}

public class Ex14_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            int age;

            System.out.print("나이를 입력하세요.: ");
            age = scanner.nextInt();
            if (age <= 0) {

                throw new AgeErrorException("0 이하의 나이는 입력할 수 없습니다.");
            }

            System.out.println("당신의 나이는 " + age + "세 입니다.");

            scanner.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }

    }
}
