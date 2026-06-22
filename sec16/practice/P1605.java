package sec16.practice;

//★★★★★
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class P1605 {
    public static void main(String[] args) {
        String[] balls = {
                "빨간색",
                "빨간색",
                "빨간색",
                "빨간색",
                "파란색",
                "파란색",
                "파란색",
                "검은색",
                "검은색",
                "검은색",
        };
        Map<String, Integer> map = new HashMap<>();

        for (String ball : balls) {

            // }
            map.put(balls[0], 1);
            if (map.containsKey(ball)) {
                map.put(balls[1], map.get(ball) + 1);
            } else {
                map.put(ball, 1);
            }
            map.put(balls[1], 2);
            System.out.println(map);// {빨간색=1}

            Set<String> keys = map.keySet();

            for (String key : keys) {
                System.out.println(key + ":" + map.get(key) + "개");
            }

            System.out.println("----------------");

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }

    }
}
