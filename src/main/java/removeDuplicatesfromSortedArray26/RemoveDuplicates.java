package removeDuplicatesfromSortedArray26;

public class RemoveDuplicates {

    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]==nums[i+1]){
//                nums[i+1]=nums[i+2];
//            }
//        }
//        int p1;
//        int p2;
//        while (){
//
//        }
        int unic = 0;
        for (int i = 1; i <nums.length; i++) {
            if (nums[unic]!=nums[i]){
                nums[++unic]=nums[i];
            }
        }
        return unic+1;
    }
}
