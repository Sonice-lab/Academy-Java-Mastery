package sec08;

class Calc {

    void sum(int num1, int num2) {
        System.out.println("두 수의 합: " + (num1 + num2));
    }
}

public class Ex08_05 {
    public static void main(String[] args) {

      Calc calc  =new Calc();
      calc.sum(4,4);
     // calc.sum(5,3);
     // calc.sum(6,3);

    
    }
}


