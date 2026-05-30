package sec10;

class BookConst {
    String title;
    int price;

    BookConst(String title, int price) {
        this.title = title;
        this.price = price;

    }

    // Book(String title, int price) {
    // this.title = title;
    // this.price = price;}

    void info() {
        System.out.println("책 제목: " + title);
        System.out.println("책 가격: " + price + "원");
    }
}

class ComicConst extends BookConst {
    boolean isColor;

    ComicConst(String title, int price, boolean isColor) {
        // this.title = title;
        // this.price = price;
        super(title, price); // 명시적 생성자 호출
        this.isColor = isColor;

    }
}

public class Ex10_02 {

    public static void main(String[] args) {
        // Book book = new Book("어린왕자", 5000);
        // book.info();

        ComicConst comic = new ComicConst("포켓몬", 5000, true);
        // comic.title = "포켓몬";
        // comic.price = 5000;

        comic.info();
        if (comic.isColor) {
            System.out.println("컬러입니다.");
        } else {
            System.out.println("흑백입니다.");
        }
    }

}
