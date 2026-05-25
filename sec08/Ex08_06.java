package sec08;

class CalcArr {
    void sum(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result += num;
        }

        System.out.println("숫자들의 합: " + result);
    }
}

public class Ex08_06 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };

        CalcArr calcArr = new CalcArr();
        calcArr.sum(nums);

        // 배열의 값

    }
}
