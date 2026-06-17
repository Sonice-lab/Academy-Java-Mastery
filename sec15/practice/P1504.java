package sec15.practice;

import java.util.Scanner;

public class P1504 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0; // count를 어떻게 처리할 것인가?
        int matchValue = 0;
        int value = 0;

        matchValue = (int) (Math.random() * 30) + 1;
        System.out.println(matchValue); // 컴퓨터가 정한 숫자

        while (count < 10) {
            count++;
            System.out.print("맞출 숫자 입력: ");
            value = scanner.nextInt();

            if (matchValue == value) {
                System.out.println(matchValue + "은 정답입니다. 축하합니다!" + count + " 번 만에 맞추셨습니다.");
                break;
            } else if (matchValue > value) {
                System.out.println("UP");

            } else {
                System.out.println("DOWN");
            }
        }
        scanner.close();
    }
}
