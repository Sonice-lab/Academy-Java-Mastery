package sec08;

class Book {

    void count(int bookNum) {
        System.out.println("책은" + bookNum + "권 입니다.");
    }
}

public class Ex08_04 {
    public static void main(String[] args) {

        Book myBook = new Book();

        myBook.count(3);

    }
}
