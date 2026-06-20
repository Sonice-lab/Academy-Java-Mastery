package sec17;

interface StrConcat {
    String concat(String str1, String str2);
}

public class StringConcat {
    public static void main(String[] args) {
        String str = "";
        // 람다식으로 변경해보기
        StrConcat strConcat = (s, v) -> {
            // str = s + v; //지역 변수 값 변경 불가!
            return str;
        };

    }
}
