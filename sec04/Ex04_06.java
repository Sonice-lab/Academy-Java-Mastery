package sec04;

import java.util.Scanner;

public class Ex04_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수는?");

        int score = scanner.nextInt();

        System.out.println(score);

        // 90점 이상: A
        // 80점 이상: B
        // 70점 이상: C
        // 60점 이상: D
        // 그 외: F

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70)

        {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");

            scanner.close();

        }
    }
}
