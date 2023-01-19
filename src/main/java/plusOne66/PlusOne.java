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
        /*int lastDigit = digits[digits.length - 1];
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

        //return result.stream().mapToInt(i -> i).toArray();*/

//        int[] all9Arr = new int[digits.length + 1];
//        if (Arrays.equals(digits, all9Arr)){
//
//        }
        boolean all9 = false;
        for (int d : digits) {
            if (d==9) {
                all9=true;
            } else {
                all9=false;
                break;
            }
        }
        //System.out.println("all9= " + all9);
        int[] result = new int[digits.length + 1];
        if (all9) {
            for (int i = 0; i < result.length; i++) {
                //i==0 ? result[i]=1 : result[i]=0;
                if (i==0) {
                    result[i]=1;
                } else {
                    result[i]=0;
                }
            }
        }

        int pointer = digits.length-1;

        if (digits[pointer] == 9 && !all9) {
            while (digits[pointer] == 9){
                digits[pointer]=0;
                pointer--;
            }
        }
        //else {
            //digits[pointer]=digits[pointer]+1;
        //}

        digits[pointer]=digits[pointer]+1;


        return all9 ? result : digits;
    }
}
