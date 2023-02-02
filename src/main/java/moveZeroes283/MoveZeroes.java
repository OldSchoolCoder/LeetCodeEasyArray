package moveZeroes283;

public class MoveZeroes {

    public void moveZeroes(int[] nums){
        int zero = 0;
        //int nonZero = 0;
//        for (int n: nums) {
//            if (n==0) {
//                nonZero++;
//            } else {
//                zero++;
//            }
        for (int i = 0; i < nums.length && zero<nums.length; i++) {
            if (nums[i]!=0 && nums[zero]==0){
                nums[zero]=nums[i];
                nums[i]=0;
                zero++;
            }

            if (nums[zero]!=0) {
//                nums[zero]=nums[i];
//                nums[i]=0;
                zero++;
            }
        }
    }
}
