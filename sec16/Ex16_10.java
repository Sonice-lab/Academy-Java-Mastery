package sec16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex16_10 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        for (int i = 1; i <= 10; i++) {
            set.add(i);
        }
        System.out.println(set); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        Iterator<Integer> iter = set.iterator();

        int count = 0;
        while (iter.hasNext()) {

            System.out.println("set 데이터" + "[" + count + "]: " + iter.next());
            count++;
        }
    }
}
