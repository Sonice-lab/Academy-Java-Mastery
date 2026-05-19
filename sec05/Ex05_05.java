package sec05;

public class Ex05_05 {
    public static void main(String[] args) {
        // 중첨 for 문
        for (int i = 0;i < 5; i++){
            // 초기화 식의 변수는 i로 시작, i,j,k,m,n..으로 변수 이름을 작명 활용함(관례)
            for(int j = 0;j<3;j++) {
                System.out.printf("i: %d, j: %d%n",i,j);
            }
            //System.out.printf("i: %d%n", i");
        }
    }
}
