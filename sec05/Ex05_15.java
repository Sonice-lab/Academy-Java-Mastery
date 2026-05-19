package sec05;

public class Ex05_15 {
    public static void main(String[] args) {
        int count = 0;

        while(true){
           count++;
            System.out.printf("나무를 %d번 찍었습니다.%n", count);

            if(count == 11) {

                //브레이크는 반복을 멈춥니다.
                //break 아래에 있는 코드는 실행되지 않음
                break;

            }

            System.out.printf("나무를 %d번 찍었습니다.%n", count); //도달할 수 없는 코드(무한루프이기에) > break로 해결

        }

        //System.out.println("나무가 쓰러집니다!"); //도달할 수 없는 코드(무한루프이기에) > break로 해결



    }
}
