package missingNumber268;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MissingNumber {

    public static void main(String[] args) {
    }

    public int missingNumber(int[] nums) {
        //Arrays.stream(nums).sorted()

        Arrays.sort(nums);
        int[] idealArr = IntStream.range(0, nums.length+1).toArray();

//        System.out.println("nums = " + Arrays.toString(nums));
//        System.out.println("idealArr = " + Arrays.toString(idealArr));

//        int result=0;
//        boolean isLast=true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=idealArr[i]){
                return i;
                //result=i;
                //isLast = false;
            }
        }

//        if (result==0){
//            result=nums.length;
//        }
//        if (Arrays.equals(nums, new int[]{1})){
//            result=0;
//        }

        //result = isLast ? nums.length : result;
        //return isLast ? nums.length : result;
        return nums.length;
    }
}
