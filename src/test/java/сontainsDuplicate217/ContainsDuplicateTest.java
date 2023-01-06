package сontainsDuplicate217;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsDuplicateTest {

    @Test
    public void main() {
    }

    @Test
    public void containsDuplicateTest() {
        boolean result = new ContainsDuplicate().containsDuplicate(new int[]{1, 2, 3, 1});
        Assert.assertTrue(result);
    }
}