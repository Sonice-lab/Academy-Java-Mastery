package sec06.Practice;

public class P0602 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

      //  for (int i =0; i < arr.length;i++) {

            //for (int num : arr) {

        //      if( arr[i] % 2 != 0);
         //     continue;
            
           //     sum += arr[i];

        

    // 향상된 for문으로 작성해주세요.

   // for(int i =0; i < arr.length;i++){

     //   if (arr[i] % 2 != 0);
     //   continue;


for (int num : arr){

    if (num % 2 != 0){
        continue;
}
    sum+=num;

    }

    System.out.println("짝수들의 합:"+sum);

}
}