package sec06;
public class Ex06_18 {
    public static void main(String[] args) {
        // 2차원 배열을 활용한 로또
        // 문자열을 비교할 때 equals 함수를 사용하여 비교
        // 얕은 복사? 비교연산자의 역할 > 참고 자료형인 경우 비교하는 대상이 참조 주소값을 비교한다.
        String str1 = "123";
        String str2 = "123";
        String str3 = new String("123");

        System.out.println(str2);
        System.out.println(str3);

        System.out.println(str1 == str2);// true
        System.out.println(str2 == str3);// false

        // 2와 3은 참조 주소값(객체 비교)이 다름
        // ==는 "객체비교"를 의미함
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));

        // 값을 비교함
        System.out.println(str2.equals(str3));

        // System.out.println(str1);
    }
}
