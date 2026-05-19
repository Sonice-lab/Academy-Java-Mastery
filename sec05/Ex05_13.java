package sec05;

public class Ex05_13 {
    public static void main(String[] args) {
        for(int i =1;i<=10;i++){
            if(i%2==0){
            System.out.print(i + "\t");
        }
    }
    
    System.out.println();

for(int i =1;i<=10;i++){
    if(i%2==1){

        continue; //i의 값이 맞을 때 continue 아래에 작성된 코드는 실행하지 않습니다. System.out.print(i + "\t"); 홀수일때는 실행이 안되도록 함
                    //반복은 계속된다. 
    }
    System.out.print(i + "\t");//홀수 출력됨

        }
    }
}

