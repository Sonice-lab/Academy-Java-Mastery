package sec15;

import java.util.Calendar;

public class Ex15_14 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        // time=1781398865261 시간을 초단위로 보여준 것 > 시간을 인지하기 힘듬(유닉스 시간) 1970 1월 1일 00시부터 경과된
        // 시간을 초단위로 환산하여 정수로 나타낸 표기법, 밀리초 > 1/1000초, 자바에서 월은 0-11월 까지이다.
        System.out.println(cal);

        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)); // 5+1을 해주어야 사람이 인식하는 달이 됨
        System.out.println(cal.get(Calendar.DATE));

        System.out.println(cal.get(Calendar.DAY_OF_WEEK));// 요일구하기 > 일요일은 1, 토요일은 7로 표기되며, 총 1-7까지의 숫자로 표시됨
    }
}
