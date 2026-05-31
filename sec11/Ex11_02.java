package sec11;

//import sec11.OpenCar.SportsCar;

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

public class Ex11_02 {
    public static void main(String[] args) {
        Car c1 = new SchoolBus(); // 자동형변(n차 상속이기에 가능)

        Bus b1 = new Bus();
        Bus b2 = new SchoolBus();// 자동형변환

        Car c2 = new OpenCar();// 자동형변환
        OpenCar oc = new SportsCar(); // 자동형변환
        Car b3 = oc;
        // Bus b4 = oc; //오픈 카와는 전혀 상관없기 때문에 오류가 됨
        // Bus b5 = new SportsCar(); //스포츠카와는 전혀 상관없기 때문에 오류가 됨
    }
}
