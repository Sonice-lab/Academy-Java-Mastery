package sec10;

class Book {
    String title;
    int price;

    // Book(String title, int price) {
    // this.title = title;
    // this.price = price;}

    void info() {
        System.out.println("책 제목: " + title);
        System.out.println("책 가격: " + price + "원");
    }
}

// 상속
// extends 사용하여 부모 클래스와 관계를 맺음
// 부모 클래스의 구성 요소(필드, 생성자, 메서드) 사용 가능
class Comic extends Book {
}

public class Ex10_01 {

    public static void main(String[] args) {
        // Book book = new Book("어린왕자", 5000);
        // book.info();

        Comic comic = new Comic();
        comic.title = "포켓몬";
        comic.price = 5000;

        comic.info();
    }

}
