package sec15;

public class Ex15_02 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1 == str2); // true > 서로 같다. > 객체 비교 > 객체의 주소를 비교한다는 의미

        System.out.println("str1: " + System.identityHashCode(str1));
        System.out.println("str2: " + System.identityHashCode(str2));

        String str3 = new String("hello");

        System.out.println(str2 == str3); // 서로 다름 > 객체 비교 > 객체의 주소를 비교한다는 의미
        System.out.println("str2: " + System.identityHashCode(str2));
        System.out.println("str3: " + System.identityHashCode(str3));

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        // 값 비교
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
    }
}
