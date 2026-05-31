package sec10.final_method;

class Book {
    String title;
    int price;

    Book(String title, int price) {// 생성자 추가

        this.title = title;
        this.price = price;
    }

    // Book(String title, int price) {
    // this.title = title;
    // this.price = price;}

    // void info() {
    // System.out.println("책 제목: " + title);
    // System.out.println("책 가격: " + price + "원");}

    void info_title() { // final 메서드(void 앞에 final이 붙는다면)는 오버라이딩이 되지 않음
        System.out.println("책의 제목은 " + title + "입니다.");
    }

    void info_price() {
        System.out.println("책의 가격은 " + price + "원 입니다.");

    }

    void info_isColor() {
        System.out.println("이 만화책은 컬러입니다.");

    }
}

class Comic extends Book {
    boolean isColor;

    Comic(String title, int price, boolean isColor) { // 생성자를 정의하기 때문에 타입명을 붙여줌
        super(title, price); // 타입을 안 적는 이유, 부모 클래스에 있는 이 생성자를 호출하기 때문에 매개 변수 타입을 적어주지 않아도 됨, 재사용의 개념, (명시적)
        this.isColor = isColor; // this는 생성자를 정의할 때 직접적으로 가리킬 때 사용, 상속하고는 관계가 없으며 인스턴스 멤버를 가리킬 때 사용
    }

    @Override
    void info_title() {
        System.out.println("이 만화책의 제목은 " + title + "입니다.");
    }

    @Override
    void info_price() {
        System.out.println("이 만화책의 가격은 " + price + "입니다.");
    }

    @Override
    void info_isColor() {
        if (isColor) {
            System.out.println("이 만화책은 컬러입니다.");
        } else {
            System.out.println("이 만화책은 흑백입니다.");
        }
    }
}

public class Ex10_09 {

    public static void main(String[] args) {
        // Book book = new Book("어린왕자", 5000);
        // book.info();

        Comic comic = new Comic("포켓몬", 5000, false);
        comic.title = "포켓몬";
        comic.price = 5000;

        comic.info_title();
        comic.info_price();
        comic.info_isColor();
    }

}
