package sec12;

abstract class Recipe { // 추상클래스는 객체를 생성할 수 없음 > 자식 클래스가 없을 경우 abstract를 지우면 정상적으로 활용 가능
    String chef;

    Recipe(String chef) {
        this.chef = chef;
    }

    void info() {
        System.out.printf("이 레시피는 %s 셰프님의 레시피입니다.%n", chef);
    }
}

class PastaRecipe extends Recipe {

    PastaRecipe(String chef) {
        super(chef);
    }
}

public class Ex12_02 {
    public static void main(String[] args) {
        // Recipe recipe = new Recipe("최연석"); // 객체 생성
        // recipe.info();

        // 추상 클래스는 스스로 객체를 생성할 수 없기 때문에 자식 클래스가 추상 클래스를 상속받아서 자식 클래스의 객체를 생성함
        Recipe pasta = new PastaRecipe("최연석"); // 부모 클래스 > 자동 형변환 가능
        pasta.info();
    }
}
