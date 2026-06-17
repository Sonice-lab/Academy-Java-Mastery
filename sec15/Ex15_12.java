package sec15;

public class Ex15_12 {
    public static void main(String[] args) {
        // 기본타입
        int num1 = 1;
        System.out.println(num1 + num1);

        Integer integerNum1 = num1;// 오토 박싱
        System.out.println(integerNum1);

        // 기본 타입 > 참조타입
        Integer num2 = Integer.valueOf(1); // Integer는 정적 메서드이기에 따로 생성없이 사용 가능, 많은 기능을 활용할 수 있기 때문에 레퍼 클래스 활용 가능
        System.out.println(num2 + num2);
        int intNum2 = num2; // 오토 언박싱
        System.out.println(intNum2);

        System.out.println("---");

        Double num3 = Double.valueOf(0.123);
        System.out.println(num3);// num3 또한 다양한 기능을 사용할 수 있음(wrapper class)
        double doubleNum3 = num3;
        System.out.println(doubleNum3);

        System.out.println("---");

        Character ch = Character.valueOf('A');
        System.out.println(ch);

    }
}
