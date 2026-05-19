package sec06;
public class Ex06_20 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        // 향상된 for문
        // - 배역(이터러블(반복가능한)iterable 객체)의 크기(요소의 갯수) 만큼 반복됨
        for (int num : arr) {

            System.out.println(num);
        }
    }
}
