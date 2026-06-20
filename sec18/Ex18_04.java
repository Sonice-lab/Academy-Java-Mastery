package sec18;

public class Ex18_04 {
    public static void main(String[] args) {
        
        System.out.println("스레드이름: " + Thread.currentThread().getName());
        //Runnable 인터페이스를 익명 클래스로 구현
        Thread myThread = new Thread(new Runnable( ) {
            @Override
            public void run() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += (i + 1);
        }

        System.out.println("sum = " + sum);
        System.out.println("스레드이름: " + Thread.currentThread().getName());

    }
            
        });
        myThread.start();

    }
}
