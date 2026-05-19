package sec06;

public class Ex06_03 {
    public static void main(String[] args) {
        int[] arr = new int[3]; // 배열의 크기 지정
        // int 타입의 경우 각 요소가 0으로 초기화됨

        System.out.println(arr); // [I@1dbd16a6

        System.out.println(arr[0]); // 0
        System.out.println(arr[1]); // 0
        System.out.println(arr[2]); // 0

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        System.out.println(arr[0]); // 10
        System.out.println(arr[1]); // 20
        System.out.println(arr[2]); // 30
        // System.out.println(arr[3]); // 결과 > 범위를 넘어섰기 때문에 실행이 되지 않음

    }
}
