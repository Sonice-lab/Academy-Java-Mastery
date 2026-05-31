package sec11;

class Bike {
    String riderName;
    int wheel = 2;

    Bike(String riderName) {
        this.riderName = riderName;
    }

    void info() {
        System.out.println(riderName + " 의 자전거는 " + wheel + " 발 자전거입니다.");
    }

    void ride() {
        System.out.println("씽씽");
    }
}

class FourWheelBike extends Bike {
    FourWheelBike(String riderName) {
        super(riderName);
    }

    @Override
    void info() {
        super.info();
        System.out.println("(보조 바퀴 부착 가능)");
    }

    // 새롭게 추가된 메서드
    void addWheel() {
        if (wheel == 2) {
            wheel = 4;
            System.out.println(riderName + " 의 자전거에 보조 바퀴를 부착하였습니다.");
            this.info();

        } else {
            System.out.println(riderName + "  의 자전거에 이미 보조 바튀가 부착되어 있습니다.");
        }
    }

}

public class Ex11_05 {
    public static void main(String[] args) {
        Bike bike = new FourWheelBike("김일남"); // 오버라이드된 메서드가 호출됨
        bike.info();
        bike.ride();
        // bike.addWheel(); //호출 안됨

        FourWheelBike fourWheelBike = (FourWheelBike) bike; // 강제형변환 > addwheel 호출 가능
        fourWheelBike.info();
        fourWheelBike.ride();
        fourWheelBike.addWheel();
    }
}
