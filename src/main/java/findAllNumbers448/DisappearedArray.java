package findAllNumbers448;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class DisappearedArray {

    public static void main(String[] args) {
        //findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        //nums[]
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]-1!=i) {
//                nums[i]=i+1;
//            }
//        }
        int i = 0;
        while (i < nums.length) {
            int correctPosition = nums[i] - 1;
            //if (correctPosition != i) {//если позиция не корректна - меняем местами
            if (nums[i] != nums[correctPosition]) {//если позиция не корректна - меняем местами
                int temp = nums[i];
                nums[i] = nums[correctPosition];
                nums[correctPosition] = temp;
            } else {
                i++;
            }
        }

        Arrays.stream(nums).forEach(System.out::println);
        System.out.println("nums = " + Arrays.toString(nums));

        List<Integer> res = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {//если элемент не соответствует индексу
                res.add(j + 1);
            }
        }

        res.forEach(System.out::println);

        return res;
    }

}
