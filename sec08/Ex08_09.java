package sec08;

public class Ex08_09 {
    static class Bus {
        void take(int money) {
            while (true) {

                if (money < 3000) {
                    System.out.println("교통카드를 충전하러 갑니다.");
                    // break;
                    return;
                }
                money -= 1500;
                System.out.println("버스를 탑니다. 잔액은" + money + "원");

            }

        }

    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.take(10000);
        // 만원
        // if (money < 1500) {
        // break;
        // return;// 반환값이 있을 때 사용하는 키워드, break와 동일하게 동작, void의 경우 메서드를 종료시키는 역할, 반환값이 없기
        // 때문에
    }

}
