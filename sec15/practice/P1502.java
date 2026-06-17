package sec15.practice;

public class P1502 {
    public static void main(String[] args) {
        String sentence1 = "사과";
        String sentence2 = new String("사과");
        String sentence3 = "망고";

        System.out.println(sentence1 == sentence2);
        System.out.println(sentence2 == sentence3); // 객체가 바라보고 있는 주소가 다름

        System.out.println(sentence1.hashCode());
        System.out.println(sentence2.hashCode()); // 1과 2는 같음
        System.out.println(sentence3.hashCode());

        System.out.println(System.identityHashCode(sentence1));
        System.out.println(System.identityHashCode(sentence2)); // 물리적 주소는 다름(논리적 주소를 같으나)

    }
}
