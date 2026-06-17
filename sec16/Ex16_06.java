package sec16;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex16_06 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> LinkedList = new LinkedList<>();

        // System.out.println(System.nanoTime());
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }

        System.out.println("ArrayList 추가 시간:\t " + duration); // 월등히 빠름

        for (int i = 0; i < 10000; i++) {
            LinkedList.add(i);
        }

        startTime = System.nanoTime();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList 추가 시간:\t " + duration);

        System.out.println("---");

        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            arrayList.add(1, i);
        }

        System.out.println("ArrayList 삽입 시간:\t " + duration);

        for (int i = 0; i < 10000; i++) {
            LinkedList.add(1, i);
        }

        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList 삽입 시간:\t " + duration); // 월등히 빠름

        System.out.println("---");

        startTime = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            arrayList.remove(1);
        }

        System.out.println("ArrayList 삭제 시간:\t " + duration);

        for (int i = 0; i < 1000; i++) {
            LinkedList.remove(1);
        }

        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList 삭제 시간:\t " + duration);
    }
}
