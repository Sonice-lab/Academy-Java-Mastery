package sec18;

class WhiteFlag implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("🏳️ 백기올려");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class BlueFlag implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("🏴 청기올려");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Ex18_06 {
    public static void main(String[] args) {
        Thread white = new Thread(new WhiteFlag());
        white.start();
        Thread blue = new Thread(new BlueFlag());
        blue.start();
    }
}
