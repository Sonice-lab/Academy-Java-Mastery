package sec09;

public class Phone {

    String brand;
    int series;
    String color;

    Phone(String brand, int series) {
        this.brand = brand;
        this.series = series;
    }

    Phone(String brand, int series, String color) {
        // this.brand = brand;
        // this.series = series;
        this(brand, series);// 순서 중요, 앞의 Phone의 생성자를 불러옴 > 코드에 대한 중복을 피하기 위함. this는 중복을 피하기 위함(자바 도큐먼트: 명시적 생성자 호출)
        this.color = color;
    }
}
