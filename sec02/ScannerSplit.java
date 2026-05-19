package sec02;

import java.util.Scanner;

public class ScannerSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름, 주소, 나이, 체중을 빈칸으로 주분하여 순서대로 입력하세요: ");
        String name = scanner.next();
        String address = scanner.next();
        int age = scanner.nextInt();
        double weight = scanner.nextDouble();

        System.out.printf("이름: %s%n", name); //줄바꿈 %n 또는 \n
        System.out.printf("주소: %s%n", address);
        System.out.printf("나이: %d%n", age);
        System.out.printf("몸무게: %.2f%n", weight);
        
        scanner.close();



    }
}
