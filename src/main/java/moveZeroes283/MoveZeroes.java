package moveZeroes283;

public class MoveZeroes {

    public void moveZeroes(int[] nums){
        //int zeroPointer = 0;
        int otherPointer = 0;
        int counter=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0 && nums[otherPointer]!=0){
                nums[i]=nums[otherPointer];
                counter++;
                otherPointer++;
            }
//            if (nums[i]==0) {
//                otherPointer
//            }
            while (nums[otherPointer]!=0 && otherPointer>i) {
                otherPointer++;
            }
        }
//        for (int n: nums) {
//            if ()
//        }
    }
}
