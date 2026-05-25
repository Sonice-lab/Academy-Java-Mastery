package sec07;

public class Ex07_03 {
    public static void main(String[] args) {
        Car car = new Car();
        // int handle = 1;
        car.ride();
        car.ride();
        car.ride();

        Car car2 = new Car(6);
        System.out.println(" 바퀴의 개수는 " + car2.wheel + " 개입니다. ");
        // car.ride();
        // car.ride();
        // car.ride();

    }
}
