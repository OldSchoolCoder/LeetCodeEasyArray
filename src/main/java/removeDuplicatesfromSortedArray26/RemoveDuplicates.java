package removeDuplicatesfromSortedArray26;

public class RemoveDuplicates {

    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {
        int unic = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[unic] != nums[i]) {
                nums[++unic] = nums[i];
            }
        }
        return unic + 1;
    }
}
