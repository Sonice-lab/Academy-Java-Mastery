package sec05;

import java.util.Scanner;

public class Ex05_17 {
    public static void main(String[] args) {

        int computer_num = (int) (Math.random() * 10) + 1;
        System.out.println(computer_num);

        boolean isMatched = false;

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("찾는 숫자를 입력 >>");
            int user_num = scanner.nextInt();

            if (computer_num == user_num) {

                System.out.println("정답입니다!");
                System.out.printf("%d번 만에 맞췄습니다.\n", i);
                isMatched = !isMatched; // FALSE니까 TRUE가 됨
                break;

            } else if (computer_num > user_num) {
                System.out.println("맞춰야 할 숫자가 더 큽니다.");

            } else {
                System.out.println("맞춰야 할 숫자가 더 작습니다.");
            }

            if (!isMatched) {
                System.out.println("정답을 맞추지 못했습니다!");
            }

        }

        scanner.close();

    }
}
