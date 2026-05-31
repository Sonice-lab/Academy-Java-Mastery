package sec11;

class Calendar {
    String color;
    int months;

    Calendar(String color, int months) {
        this.color = color;
        this.months = months;
    }

    void info() {
        System.out.println(color + "달력은" + months + "월까지 있습니다.");
    }

    void hanging() {
        System.out.println(color + "달력은 벽에 걸 수 있습니다.");
    }
}

class DeskCalendar extends Calendar {
    DeskCalendar(String color, int months) {
        super(color, months);
    }

    @Override
    void hanging() {
        System.out.println(color + "달력은 벽에 걸기 위해 고리가 추가로 필요합니다.");
    }

    void onTheDesk() {
        System.out.println(color + "달력을 책상에 세울 수 있습니다.");
    }
}

public class Ex11_04 {
    public static void main(String[] args) {
        DeskCalendar dc = new DeskCalendar("보라색", 6);
        dc.info();
        dc.hanging();
        dc.onTheDesk();

        System.out.println("------");

        Calendar c = dc;

        c.info();
        c.hanging(); // 오버라이딩된 메서드가 호출됨
        // c.onTheDesk(); //데스크 캘린더에 있는 메서드는 사용할 수 없음 > 호출 불가
    }
}
