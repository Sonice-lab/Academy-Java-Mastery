package sec05;

public class Ex05_14 {
    public static void main(String[] args) {
        int sum = 0;
       
      //  for(int i = 1;i<=100;i++){

       //     if(i%2 ==0){
         //       sum += i;

           // }
       // }
       // System.out.println("짝수의 합: " + sum);
        
        
        
        for(int i = 1;i<=100;i++){

            if(i % 2 == 1){
                //sum += i;
                continue;
            }

            sum += i; //이 코드가 실행되지 않도록 하는 명령문
        }


        System.out.println("짝수의 합: " + sum);



    }
}
