import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {// throws Exception는 지워도 상관없음, String[] args 문자열 값이 들어있는 배열
                                                             // 매개변수, 메인 메서드가 호출될 때 할당
        System.out.println(Arrays.toString(args));
    }
}
