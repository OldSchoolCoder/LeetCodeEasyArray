package missingNumber268;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MissingNumber {

    public static void main(String[] args) {
    }

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int[] idealArr = IntStream.range(0, nums.length + 1).toArray();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != idealArr[i]) {
                return i;
            }
        }
        return nums.length;
    }
}
