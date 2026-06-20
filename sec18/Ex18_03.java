package sec18;

class MyRunnableThread implements Runnable {

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

public class Ex18_03 {
    public static void main(String[] args) {
        System.out.println("스레드이름: " + Thread.currentThread().getName());
        Thread myThread = new Thread(new MyRunnableThread());
        myThread.start();

    }
}
