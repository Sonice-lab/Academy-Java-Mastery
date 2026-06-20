package sec16;

import java.util.HashMap;
import java.util.Map;

public class Ex16_11 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("spring", "봄");
        map.put("summer", "여름");
        map.put("autumn", "가을");
        map.put("winter", "겨울");

        System.out.println(map); // {spring=봄, winter=겨울, autumn=가을, summer=여름}, 한 요소(덩어리)을 Map.Entry 객체라고 부름

        map.put("spring", "봄봄"); // 키가 이미 있는 경우
        System.out.println(map); // {spring=봄봄, winter=겨울, autumn=가을, summer=여름} > 기존의 키 정보가 변경됨

        map.remove("spring");
        System.out.println(map); // {winter=겨울, autumn=가을, summer=여름}

        System.out.println(map.containsKey("spring")); // false 반환
        System.out.println(map.containsKey("summer")); // true 반환

        System.out.println(map.keySet()); // [winter, autumn, summer]
        System.out.println(map.entrySet()); // [winter=겨울, autumn=가을, summer=여름] > set안의 Entry 객체를 반환함

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("키: " + entry.getKey() + ", 값: " + entry.getValue()); // map 객체를 반복문으로 돌린 경우
        }

    }
}
