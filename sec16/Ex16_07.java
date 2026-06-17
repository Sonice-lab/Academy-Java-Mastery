package sec16;

import java.util.HashSet;
import java.util.Set;

public class Ex16_07 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        System.out.println(set);

        set.add("김일남");
        set.add("김이남");
        set.add("김삼남");

        System.out.println(set); // 순서가 없음

        set.add("김일남");
        set.add("김일남");
        set.add("김일남");
        set.add("김일남");
        set.add("김일남");
        set.add("김일남");
        set.add("김일남");

        System.out.println(set); // ★중복을 허용하지 않음

        set.remove("김일남");

        System.out.println(set); // ★set으로 삭제 x, 인덱스로 접근x, 해당 요소의 값을 그대로 적어야 삭제 가능

        set.contains("김일남");

        System.out.println("김일남");

        set.clear();
        System.out.println(set);
    }
}
