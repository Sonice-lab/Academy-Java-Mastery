package sec08;

public class Ex08_08 {
    public static void main(String[] args) {
        int count = 0;
        while (true) {// 무한루프
            System.out.println(++count + "번 찍었습니다.");

            if (count == 10) {
                break;
                 //return;// 반환값이 있을 때 사용하는 키워드, break와 동일하게 동작, void의 경우 메서드를 종료시키는 역할, 반환값이 없기
                // 때문에
            }
        }
        System.out.println("프로그램을 종료합니다!"); // return을 했을 때는 이 명령어가 안먹음, 이미 return의 시점에서 메인 메서드가 종료되었기 때문
    }
}
