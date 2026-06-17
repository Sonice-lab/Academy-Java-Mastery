package sec15;

import java.util.HashSet;
import java.util.Set;

public class Ex15_03 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");

        System.out.println(str1 == str2);
        System.out.println("str1: " + str1.hashCode()); // 99162322
        System.out.println("str2: " + str2.hashCode()); // 99162322
        System.out.println("str3: " + str3.hashCode()); // 99162322

        // System.out.println(str2 == str3); // 서로 다름 > 객체 비교 > 객체의 주소를 비교한다는 의미
        System.out.println("str2: " + System.identityHashCode(str2)); // 물리적 주소 > 우리가 바꿀 수 없음
        System.out.println("str3: " + System.identityHashCode(str3));

        // System.out.println(str1);
        // System.out.println(str2);
        // System.out.println(str3);

        Set<String> list = new HashSet<>();
        list.add(str1);
        list.add(str2);
        list.add(str3);

        System.out.println(list.size());
    }
}
