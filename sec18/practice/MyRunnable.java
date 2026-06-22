package sec18.practice;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + "초");
        }
    }

    public static void main(String[] args) {
        // 1. Runnable 인터페이스를 구현한 객체 생성
        // MyRunnable myRunnable = new MyRunnable();

        // 2. Thread 객체 생성 (매개변수로 Runnable 객체 전달)
        Thread thread = new Thread(new MyRunnable());

        // 3. 스레드 실행 (run() 메서드가 백그라운드에서 호출됨)
        thread.start();

    }
}
