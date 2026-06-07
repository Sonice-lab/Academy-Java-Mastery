package sec12.interface_phone;

// 인터페이스 구성요소
// - 상수
// - 추상 메서드
// - 디폴트(기본) 메서드(java8 부터 추가됨)
interface Phone {

    public static final int MAX_BATTERY_CAPACITY = 100;
    // (public static final) int MAX_BATTERY_CAPACITY = 100; 도 가능

    // 상수를 표현할 때 단어의 연결은 스네이크 케이스, 값이 한번 정해지면 초기화할 수 없음
    // 상수는 반드시 파이널 키워드를 무저건 필요함
    public abstract void powerOn();

    void powerOff(); // public abstract 생략

    boolean isOn();

    void watchUtube();

    void charge();

}

class ApplePhone implements Phone {
    int batteryCapacity = 40;
    boolean isOn = false;

    @Override
    public void powerOn() {
        if (batteryCapacity > 30) {
            System.out.println("🍏 Power On!");
            isOn = true;
        } else {
            System.out.println("Low Battery...");
        }
    }

    @Override
    public void powerOff() {
        System.out.println("🍏 Power Off!");
        isOn = false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void watchUtube() {
        if (isOn) {
            if (batteryCapacity > 10) {
                System.out.println("---watching Utube ---");
                batteryCapacity -= 10;
                System.out.println("battery is..." + batteryCapacity + "%");
            } else {
                System.out.println("Low battery");
                powerOff();
            }
        }
    }

    @Override
    public void charge() {
        if (batteryCapacity < Phone.MAX_BATTERY_CAPACITY) {
            System.out.println("--- charging ---");
            batteryCapacity += 5;
            System.out.println("battery is..." + batteryCapacity + "%");
        } else {
            System.out.println("You don't have to charge...");
            System.out.println("battery is..." + batteryCapacity + "%");
        }
    }

}

class SamsongPhone implements Phone {
    int batteryCapacity = 50;
    boolean isOn = false;

    @Override
    public void powerOn() {
        if (batteryCapacity > 30) {
            System.out.println("🌟 폰이 켜졌습니다!");
            isOn = true;
        } else {
            System.out.println("배터리가 부족합니다...");
        }
    }

    @Override
    public void powerOff() {
        System.out.println("🌟 폰이 전원을 종료합니다.");
        isOn = false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void watchUtube() {
        if (isOn) {
            if (batteryCapacity > 10) {
                System.out.println("---유튜브 시청 중 ---");
                batteryCapacity -= 10;
                System.out.println("잔여 배터리는 " + batteryCapacity + "%");
            } else {
                System.out.println("배터리가 부족합니다.");
                powerOff();
            }
        }
    }

    @Override
    public void charge() {
        if (batteryCapacity < Phone.MAX_BATTERY_CAPACITY) {
            System.out.println("--- 충전중 ---");
            batteryCapacity += 5;
            System.out.println("잔여 배터리는 " + batteryCapacity + "%");
        } else {
            System.out.println("충전할 필요가 없습니다.");
            System.out.println("잔여 배터리는 " + batteryCapacity + "%");
        }
    }

}

class Person {
    Phone phone;// 인터페이스 타입 필드, 인터페이스는 다형성을 구현할 수 있음
    // 하나의 타입으로 다양한 객체를 사용해서 다양한 결과를 얻을 수 있음 > 인터페이스의 다형성

    Person(Phone phone) {
        this.phone = phone;
    }

    void buyNewPhone(Phone phone) {
        this.phone = phone;
        System.out.println("--------------------------");
        System.out.println("새 폰을 샀습니다.");
    }

    void turnOnPhone() {
        phone.powerOn();
    }

    void turnOffPhone() {
        phone.powerOff();
    }

    void watchUtube() {
        if (phone.isOn()) {
            phone.watchUtube();
        } else {
            System.out.println("폰이 꺼져있기 때문에 유튜브를 볼 수 없습니다.");
        }
    }

    void chargePhone() {
        phone.charge();
    }
}

public class Ex12_06 {
    public static void main(String[] args) {
        ApplePhone applePhone = new ApplePhone();
        // applePhone.powerOn();
        // applePhone.watchUtube();
        // applePhone.watchUtube();
        // applePhone.watchUtube();
        // applePhone.powerOff();

        // SamsongPhone SamsongPhone = new SamsongPhone();
        // SamsongPhone.powerOn();
        // SamsongPhone.watchUtube();
        // SamsongPhone.watchUtube();
        // SamsongPhone.watchUtube();
        // SamsongPhone.watchUtube();
        // SamsongPhone.powerOff();

        Person kim1 = new Person(applePhone);
        Person kim2 = new Person(new SamsongPhone());

        kim1.turnOnPhone();
        kim1.watchUtube();
        kim1.turnOffPhone();

        kim1.buyNewPhone(new SamsongPhone());
        kim1.turnOnPhone();
        kim1.watchUtube();
        kim1.turnOffPhone();

        System.out.println("------------------");

        kim2.turnOnPhone();
        kim2.watchUtube();
        kim2.turnOffPhone();
    }
}
