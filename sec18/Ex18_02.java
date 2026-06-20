package sec18;

class MyThread extends Thread {
    // 2개의 스레드가 동작하는 유형
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += (i + 1);
        }

        System.out.println("sum = " + sum);
        System.out.println("스레드이름: " + Thread.currentThread().getName());

    }
}

public class Ex18_02 {
    public static void main(String[] args) {
        System.out.println("스레드이름: " + Thread.currentThread().getName());
        MyThread myThread = new MyThread();
        myThread.start(); // run이 아닌 start 메서드를 호출해야 함

    }
}
