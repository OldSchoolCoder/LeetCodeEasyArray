package сontainsDuplicate217;

import java.util.Arrays;

public class ContainsDuplicate {

    public static void main(String[] args) {
    }

    public boolean containsDuplicate(int[] nums) {
        long countOriginal = Arrays.stream(nums).count();
        long countDistinct = Arrays.stream(nums).distinct().count();
        System.out.println("countOriginal = " + countOriginal + " countDistinct = " + countDistinct);
        return countOriginal != countDistinct;
    }
}
