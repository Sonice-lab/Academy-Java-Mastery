package sec15;

class Car {
    private String carName;
    private String company;

    Car(String carName, String company) {
        this.carName = carName;
        this.company = company;
    }

    // toString > 객체 문자 정보 반환
    @Override
    public String toString() {
        return "차량 이름: " + this.carName + ", 제조사: " + this.company;
    }
}

public class Ex15_05 {
    public static void main(String[] args) {
        Car car = new Car("소나타", "현대"); // 객체 출력, 생성자 입력(소나타, 현대)
        System.out.println(car);
    }
}
