package findAllNumbers448;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class DisappearedArrayTest {

    @Test
    public void main() {
    }

    @Test
    public void findDisappearedNumbers() {
        List<Integer> result = new DisappearedArray().findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        Collections.sort(result);
        Assert.assertTrue(result.equals(new ArrayList<Integer>()));
        //Assert.assertArrayEquals(result, new int[]{4, 3, 2, 7, 8, 2, 3, 1});
    }
}