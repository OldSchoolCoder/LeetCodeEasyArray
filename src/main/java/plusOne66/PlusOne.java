package plusOne66;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {

    public static void main(String[] args) {
    }

    public int[] plusOne(int[] digits) {
        //int[] result = new int[0];
       //List<Integer> result = new ArrayList<>();
        //String string = digits.toString();
//        String string = Arrays.toString(digits);
//        System.out.println(string);
        //Integer.valueOf(1);
        int lastDigit = digits[digits.length - 1];
        if (lastDigit==9){
            digits[digits.length-1]=0;

            //digits[digits.length-2]=lastDigit+1;
        } else {
            digits[digits.length-1]=lastDigit+1;
        }
        System.out.println(Arrays.toString(digits));
        //System.out.println(lastDigit);
//        for (int i = 0; i < digits.length; i++) {
//
//        }

        //return result.stream().mapToInt(i -> i).toArray();
        return digits;
    }
}
