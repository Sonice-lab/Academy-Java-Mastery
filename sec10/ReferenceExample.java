package sec10;

public class ReferenceExample {
    public static void main(String[] args) {
        // 1. 원본 '집' 생성 (0번째 방에 10이 있음)
        int[]myHouse = {10, 20, 30};

        System.out.println("변경 전 원본 값: " + myHouse[0]);

        // 2. 상황 A: 내부 데이터 변경 시도
        changeData(myHouse);
        System.out.println("상황 A 후 원본 값: " + myHouse[0]);

        // 3. 상황 B: 아예 새로운 집으로 주소 변경 시도
        changeAddress(myHouse);
        System.out.println("상황 B 후 원본 값: " + myHouse[0]);


    }
      // 상황 A: 주소로 찾아가서 내부 데이터를 바꾸는 메서드
    public static void changeData(int[] friendNote) {
        friendNote[0] = 99;
    }

    // 상황 B: 자기 쪽지의 주소 자체를 바꾸는 메서드
    public static void changeAddress(int[] friendNote) {
        friendNote = new int[]{100, 200, 300};
    }
}
