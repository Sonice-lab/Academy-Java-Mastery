package sec04;

public class Ex04_10 {
    public static void main(String[] args) {
        int num = 2;
        //소괄호에는 조건식 (boolean 평가) 아닌 값을 전달
        switch(num) {
            // 흘러내림, int에 2만 넣으면 2만 출력됨
            case 1: System.out.println("1입니다!");
                    break; //아래 코드가 실행되지 않데 실행 흐름을 멈춤
            case 2: System.out.println("2입니다!");
                    break;
            case 3: System.out.println("3입니다!");
                    break;
            default: System.out.println("없습니다!");

        }
    }
}
