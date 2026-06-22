package sec18;

//동기화의 필요성에 대한 예시 > 메서드 동기화 처리

class Bank {
    private int money;

    // public synchronized void setMoney(int money) { 동기화의 필요성에 대한 예시 > 메서드 동기화 처리

    public void setMoney(int money) {
        this.money += money;
    }

    public int getMoney() {
        return money;
    }
}

class AddThread implements Runnable {
    private Bank bank;
    private String name;

    public AddThread(String name, Bank bank) {
        this.bank = bank;
        this.name = name;

    }

    @Override
    public void run() {
        synchronized (bank) { // 동기화의 필요성에 대한 예시 > 블록 동기화 처리
            try {

                Thread.sleep(500); // 0.5초
                for (int i = 0; i < 10; i++) {
                    bank.setMoney(1000);
                    System.out.println(this.name + " 현재 잔고: " + bank.getMoney());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class Ex18_07 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Thread thread1 = new Thread(new AddThread("1번", bank));
        Thread thread2 = new Thread(new AddThread("2번", bank));
        thread1.start();
        thread2.start();
    }
}
