package sec10;

class Car {
    void ride() {
        System.out.println("달립니다.");
    }
}

class Bus extends Car {
    int peopleNum;

    Bus(int peopleNum) {
        this.peopleNum = peopleNum;
    }

    void takePerson() {
        System.out.println("승객이 버스를 탔습니다.");
        peopleNum++;
        System.out.printf("지금까지 탑승한 승객은 %d명입니다.%n", peopleNum);
    }
}

// N차 상속
// Car > Bus > SchoolBus
// SchoolBus는 Car, Bus 클래스의 구성 요소(필드, 메서드, 생성자) 모두 사용 가능
class SchoolBus extends Bus {
    SchoolBus(int peopleNum) {
        super(peopleNum);
    }

    @Override
    void takePerson() {
        super.takePerson();
        System.out.println("학생들이 자리에 모두 착석하고 출발합니다.");
    }

    @Override
    void ride() {
        System.out.println("시속 50km/h로 천천히 달랍니다.");
    }
}

public class Ex10_05 {
    public static void main(String[] args) {
        SchoolBus bus = new SchoolBus(10);
        bus.takePerson();
        // bus.takePerson();
        bus.ride();

    }
}
