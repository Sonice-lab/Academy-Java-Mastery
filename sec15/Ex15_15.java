package sec15;

import java.util.Calendar;
import java.util.Scanner;

public class Ex15_15 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        Scanner scanner = new Scanner(System.in);

        System.out.print("연도를 입력하세요.: ");
        int year = scanner.nextInt();

        System.out.print("월을 입력하세요.: ");
        int month = scanner.nextInt();

        cal.set(year, month - 1, 1);

        // System.out.println(cal);

        System.out.println("일\t월\t화\t수\t목\t금\t토");

        int lastOfDate = cal.getActualMaximum(Calendar.DATE); // 반복의 끝을 의미
        // System.out.println(lastOfDate);

        int week = cal.get(Calendar.DAY_OF_WEEK);
        // System.out.println(week); //월요일을 의미 6월 1일은 월요일을 의미

        // 1. 달력 시작 전 빈칸(일요일)에 띄우기
        for (int i = 1; i < week; i++) {

            System.out.print("\t");
        }
        // 2. 날짜 출력하기
        for (int i = 1; i <= lastOfDate; i++) {

            System.out.print(i + "\t");

            if (week % 7 == 0) { // 위크를 기준으로 줄바꿈 처리가 진행되어야 함
                System.out.println();
            }

            week++;

        }
        scanner.close();

    }
}
