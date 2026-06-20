package sec18;

public class Ex18_05 {
    public static void main(String[] args) {

        System.out.println("스레드이름: " + Thread.currentThread().getName());
        // 람다식 사용
        Thread myThread = new Thread(() -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += (i + 1);
            }

            System.out.println("sum = " + sum);
            System.out.println("스레드이름: " + Thread.currentThread().getName());

        });
        myThread.start();

    }
}
