package sec11;

class FarmInstanceof {
    void makeSound(Animal animal) { // pig > animal로 변경 > 자동형변환을 유도
        if (animal instanceof Pig) {
            System.out.println("돼지 소리");
        }
        if (animal instanceof Dog) {
            System.out.println("강아지 소리");
        }
        if (animal instanceof Cat) {
            System.out.println("고양이 소리");
        }
    }
}

public class Ex11_09 {
    public static void main(String[] args) {
        FarmInstanceof farm = new FarmInstanceof();

        farm.makeSound(new Dog());
        farm.makeSound(new Cat());
        farm.makeSound(new Pig());
    }
}
