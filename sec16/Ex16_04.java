package sec16;

import java.util.ArrayList;

public class Ex16_04 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        System.out.println(list); // []: 비어있는 대괄호로 출력

        list.add("김일남"); // (마지막 인덱스에) 요소 추가
        list.add("김이남");
        list.add("김삼남");
        System.out.println(list); // [김일남, 김이남, 김삼남]

        list.add(1, "이이남"); // [김일남, 이이남, 김이남, 김삼남], 요소삽입

        System.out.println(list);

        list.set(1, "김이남"); // [김일남, 김이남, 김이남, 김삼남] > 중복된 값이 허용됨, 요소변경

        System.out.println(list);

        list.remove(1); // [김일남, 김이남, 김삼남] 인덱스 1(2번째요소) 삭제

        System.out.println(list);

        System.out.println(list.get(1));

        System.out.println(list.contains("김일남")); // 특정 요소가 있는지 확인 > true
        System.out.println(list.contains("김사남")); // 특정 요소가 있는지 확인 > false

        list.clear();

        System.out.println(list); // [] 전체 삭제 

    }
}
