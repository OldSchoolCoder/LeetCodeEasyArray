package plusOne66;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlusOneTest {

    @Test
    public void main() {
    }

    @Test
    public void plusOne0() {
        int[] result = new PlusOne().plusOne(new int[]{1, 1});
        Assert.assertArrayEquals(result, new int[]{1, 2});
    }

    @Test
    public void plusOne1() {
        int[] result = new PlusOne().plusOne(new int[]{7, 9});
        Assert.assertArrayEquals(result, new int[]{8, 0});
    }

    @Test
    public void plusOne() {
        int[] result = new PlusOne().plusOne(new int[]{9, 9});
        Assert.assertArrayEquals(result, new int[]{1, 0, 0});
    }

}