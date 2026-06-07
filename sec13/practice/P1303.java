package sec13.practice;

//import sec07.Person;
//import sec13.practice.MyCar.Promotion;

class MyCar {
    private int price;
    private String myName;

    public MyCar(String myName, int price) {
        this.myName = myName;
        this.price = price;
    }

    String getInfo() {
        String str = "차량: " + myName + ", 가격: " + price;
        return str;
    }

    class Promotion {
        int discount() { // 인스턴스 메서드 안에 있는 클래스
            int discount = 0;
            discount = price / 100;
            return discount;
        }
    }
}

public class P1303 {
    public static void main(String[] args) {
        MyCar mycar = new MyCar("소나타", 4000);
        MyCar.Promotion promotion = mycar.new Promotion();

        System.out.println(mycar.getInfo() + ", 할인금액: " + promotion.discount());
    }
}
