package sec10;

public class CallByValueExample {
    public static void main(String[] args) {
        int originalValue = 10;

        System.out.println("1. 메서드 호출 전 원본 값: " + originalValue);

        changeValue(originalValue);

        System.out.println("2. 메서드 호출 후 원본 값: " + originalValue);
    }

    public static void changeValue(int copyValue) {
        copyValue = 20;
        System.out.println("3. 메서드 내부에서 변경된 값: " + copyValue );
    }
}
