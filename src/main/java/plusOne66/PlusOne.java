package plusOne66;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {

    public static void main(String[] args) {
    }

    public int[] plusOne(int[] digits) {
        boolean all9 = false;
        for (int d : digits) {
            if (d == 9) {
                all9 = true;
            } else {
                all9 = false;
                break;
            }
        }
        int[] result = new int[digits.length + 1];
        if (all9) {
            for (int i = 0; i < result.length; i++) {
                if (i == 0) {
                    result[i] = 1;
                } else {
                    result[i] = 0;
                }
            }
        }
        int pointer = digits.length - 1;
        if (digits[pointer] == 9 && !all9) {
            while (digits[pointer] == 9) {
                digits[pointer] = 0;
                pointer--;
            }
        }
        digits[pointer] = digits[pointer] + 1;
        return all9 ? result : digits;
    }
}
