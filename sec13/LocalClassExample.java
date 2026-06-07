package sec13;

public class LocalClassExample {
    // public static void main(String[] args) {
    private int speed = 10;

    void getUnit(String unitName) {

        // 지역(local) 내부 클래스
        // 메서드 안에 정의도니 클래스
        class Unit {

            // unitName = unitName + "님"; //메서드의 매개 변수는 상수로 취급됨(변경 불가)

            String newUnitName = unitName + "님";

            void move() {
                System.out.println(newUnitName + "이 " + speed + " 속도로 이동합니다.");
            }
        }

        Unit unit = new Unit(); // 이 때 제일 앞 유닛은 클래스 타입을 의미한다.
        unit.move();
    }

    public static void main(String[] args) {
        LocalClassExample local = new LocalClassExample();
        local.getUnit("김일남");
    }

}
