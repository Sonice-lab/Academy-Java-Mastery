package sec15;

public class Ex15_07 {
    public static void main(String[] args) {
        String s = "Hello World, Hello Java";

        System.out.println(s.length());// 문자열의 총길이 > 23
        System.out.println(s.charAt(19)); // H, 19열 > J 출력
        System.out.println(s.indexOf("World")); // 문자열이 시작하는 인덱스가 찍힘
        System.out.println(s.indexOf('W')); // 문자열이 시작하는 인덱스가 찍힘, 홑따옴표 사용

        String new_s = s.replace("Java", "자바");
        System.out.println(new_s);

        System.out.println(s.substring(13, 18));

    }
}
