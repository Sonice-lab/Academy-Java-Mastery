package sec11.practice;

class Car {
}

class Bus extends Car {
}

class SchoolBus extends Bus {
}

class OpenCar extends Car {
}

class SportsCar extends OpenCar {
}

public class P1101 {
    public static void main(String[] args) {
        Car c1 = new SchoolBus();
        Bus b1 = new Bus();
        // SchoolBus sb = (SchoolBus) new Car(); // 반드시 강제형변환 > 전체 코딩에 오류 부모 > 자식 형변환 x
        // 자식 > 부모 > 자식 형변환 o
        Car c2 = new OpenCar();
        OpenCar oc = new SportsCar();
        // Bus b3 = new OpenCar(); // 전혀 무관함
        // Bus b4 = new SportsCar(); // 전혀 무관함
        Car b3 = new OpenCar();
        Car b4 = new SportsCar();

    }
}
