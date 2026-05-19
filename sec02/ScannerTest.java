package sec02;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
    // 표준(Standard) 입력
    Scanner scanner = new Scanner(System.in); //메모리 누수
    
    System.out.print("나이를 입력하세요: ");
    int age = scanner.nextInt();
    System.out.printf("당신의 나이는 %d세 입니다.", age);

    scanner.close(); // 메모리 누수 방지
    }
}
