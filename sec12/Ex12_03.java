package sec12;

//import sec12.interface_phone.Phone;

abstract class Phone {
    abstract void openingLogo();

    void powerOn() {
        openingLogo();
        System.out.println("핸드폰이 켜집니다.");

    }

    void powerOff() {
        System.out.println("핸드폰이 꺼집니다.");
    }
}

class ApplePhone extends Phone {
    @Override
    void openingLogo() {
        System.out.println("🍏🍏🍏");
    }

}
class SamsongPhone extends Phone {
    @Override
    void openingLogo() {
        System.out.println("🌟🌟🌟");
    }

}

public class Ex12_03 {
    public static void main(String[] args) {
        Phone applePhone = new ApplePhone();
        applePhone.powerOn();
        applePhone.powerOff();
        
        Phone samsongPhone = new SamsongPhone();
        samsongPhone.powerOn();
        samsongPhone.powerOff();
    }
}
//  추상 클래스(메서드)는 가이드라인을 (강제) 제공하여 표준화를 유도함!
