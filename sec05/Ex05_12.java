package sec05;

public class Ex05_12 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        do{
            sum += i;
            i++;

        } while(i<=10);

        //while(i<=10);가 10이 아닌 0이더라도 최소한 한번은 실행됨
        System.out.println("합:"+sum);
        
    }
}
