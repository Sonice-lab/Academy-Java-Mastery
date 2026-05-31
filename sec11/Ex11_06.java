package sec11;

class Animal {
    void cry() {
        System.out.println("동물 소리~");
    }
}

class Pig extends Animal {
    void cry() {
        System.out.println("꿀꿀");
    }
}

class Dog extends Animal {
    void cry() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    void cry() {
        System.out.println("야옹야옹");
    }
}

class Tiger extends Animal {
    void cry() {
        System.out.println("어흥");
    }
}

class Farm {
    void makeSound(Animal animal) { // pig > animal로 변경 > 자동형변환을 유도
        animal.cry();
    }
}

public class Ex11_06 {
    public static void main(String[] args) {
        Pig pig = new Pig(); // class pig > 터미널에 출력
        Dog dog = new Dog();
        // Cat car = new Cat(); > 이렇게 하지 않아도 아래와 같이 호출하면 좀 더 효율적으로 호출 가능

        Farm farm = new Farm();

        // 다형성(polymorphism)
        // 하나의 타입(animal)으로 다양한 객체(pig, dog, cat, tiger)를 사용해서
        // 다양한 결과(다양한 동물 울음 소리 생성)를 만들어낸다.(다양성의 장점) > 다양성을 안 쓸 경우 조건문을 만들어야 함
        farm.makeSound(pig); // class farm에서 출력
        farm.makeSound(dog); // class farm에서 출력
        farm.makeSound(new Cat()); // class farm에서 출력
        farm.makeSound(new Tiger()); // class farm에서 출력

    }
}
