package sec15;

public class Ex15_09 {
    public static void main(String[] args) {
        String str = "자바 프로그래밍은 어렵지만 자바를 배울수록 재미있습니다.";

        System.out.println(str.replace("자바", "Java"));
        System.out.println(str.replaceAll("자바", "Java"));

        System.out.println("---------");

        String phone1 = "010.1234.5678";
        String phone2 = "010 1234 5678";
        String phone3 = "010-1234-5678";

        // replaceAll 메서드에만 있는 기능 > 우리가 원하는대로 양식을 일괄적으로 바꿀 수 있음
        // replaceAll 메서드는 replace과 달리 정규 표현식 사용 가능
        String regex = "[^0-9]"; // 0~9까지의 숫자가 아니면 건너뛰겠다는 의미 > 정규표현식을 활용한 양식 바꾸기
        System.out.println(phone1.replaceAll(regex, "-"));
        System.out.println(phone2.replaceAll(regex, "-"));
        System.out.println(phone3.replaceAll(regex, "-"));
    }
}
