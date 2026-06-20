package sec16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex16_09 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list); // [1, 2, 3, 4, 5]

        for (Integer n : list) {
            System.out.println(n);
        }

        Iterator<Integer> iter = list.iterator();
        System.out.println(iter); // java.util.Arrays$ArrayItr@1dbd16a6 > 출력된 값으로 보아 서로 다른 객체의 형식임을 알 수 있음

        // System.out.println(iter.hasNext()); // true
        // System.out.println(iter.next()); // 1

        // System.out.println(iter.hasNext()); // true
        // System.out.println(iter.next()); // 2

        // System.out.println(iter.hasNext()); // true
        // System.out.println(iter.next()); // 3 > 내가 필요할 때 요소를 꺼내어 쓸 수 있음

        // System.out.println(iter.hasNext()); // true
        // System.out.println(iter.next()); // 4 > 내가 필요할 때 요소를 꺼내어 쓸 수 있음

        // System.out.println(iter.hasNext()); // true
        // System.out.println(iter.next()); // 5 > 내가 필요할 때 요소를 꺼내어 쓸 수 있음

        // System.out.println(iter.hasNext()); // true
        // System.out.println(iter.next()); // false

        while (iter.hasNext()) {
            System.out.println(iter.next()); // 1~5까지 순차적으로 출력해냄 next와 hasNext는 둘다 동일함

        }

    }
}
