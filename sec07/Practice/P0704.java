package sec07.Practice;

public class P0704 {
    public static void main(String[] args) {
        Speaker speaker = new Speaker();
        speaker.turnOn();

    }
}

class Speaker {
    // 메모리에 언제 올라가는가?, 올라가는 시점이 중요, 인스턴스 멤버 안에 정적 멤버가 들어갈 수 없음 (메서드내에 존재할 수 없음)
    // 정적멤버: volume, 인스턴스 멤버: turnOn
    static int volume = 50;

    void turnOn() {

        System.out.println("스피커의 전원이 켜졌습니다. 기본 볼륨은 " + volume + "입니다.");
    }

}