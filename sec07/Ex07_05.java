package sec07;

public class Ex07_05 {
    public static void main(String[] args) {

        Family father = new Family();
        Family son = new Family();
        // Family son = new family();
        // 동일한 클래스이더라고 별개의 속성을 가지고 있음 같은 속성을 가지고 싶게 할경우 정적 클래스를 활용함
        // father.address = "서울";

        Family.address = "서울"; // static 멤버는 클래스명으로 접근하는 것을 권장
        System.out.println(Family.address);

        // son.address = "부산";
        System.out.println(son.address);

    }
}
