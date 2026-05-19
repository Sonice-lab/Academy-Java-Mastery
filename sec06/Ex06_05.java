package sec06;

public class Ex06_05 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        System.out.println("--- 1. 초기 배열 출력 ---");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");

            numbers[0] = 1;
            numbers[1] = 2;

        }
        System.out.println();

        System.out.println("\n--- 2. 모든 요소를 1로 변경 ---");
        for (int i = 0; i < 10; i++) {
            numbers[i] = 1;
            System.out.print(numbers[i] + " ");

            // numbers[0] =
        }

        System.out.println();

        System.out.println("\n--- 3. i * i 값으로 변경 ---");
        

        for (int i = 0; i < 10; i++) {
            numbers[i] = i * i;
            System.out.print(numbers[i] + " ");

            // numbers[0] =
        }

        System.out.println();

        System.out.println("\n--- 4. 랜덤 값(1~30) 할당 및 짝수 계산 ---");

        System.out.print("전체 배열: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = (int) (Math.random() * 30) + 1;
            System.out.print(numbers[i] + " ");

            int count = 0;
            int sum = 0;

            System.out.print("찾은 짝수: ");

            for (int j = 0; j < 10; j++) {
                if (numbers[i] % 2 == 0) {
                    System.out.print(numbers[i] + " ");
                    count++;
                    sum += numbers[i];

                }
            }

            System.out.println();
            System.out.println("짝수의 개수:" + count);
            System.out.println("짝수의 총합: " + sum);

        }

    }
}
