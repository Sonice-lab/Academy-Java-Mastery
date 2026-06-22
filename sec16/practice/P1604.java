package sec16.practice;

import java.util.ArrayList;
import java.util.List;

public class P1604 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            // 랜덤 함수를 이용하여 숫자 넣기(1~100)
            // int randomNum = (int) (Math.random() * 100) + 1;
            // list.add(randomNum);
            int value = (int) (Math.random() * 100) + 1;
            list.add(value);

        }
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            // 짝수만 sum에 누적
            // int currentNum = list.get(i);
            // if (currentNum % 2 == 0) {
            // sum += currentNum;
            // }
            int value = list.get(i);
            if (value % 2 == 0) {
                sum += list.get(i);
            }

        }

        System.out.println("짝수의 합: " + sum);

    }
}
