package missingNumber268;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MissingNumberTest {

    @Test
    public void main() {
    }

    @Test
    public void missingNumber() {
        int missingNumber = new MissingNumber().missingNumber(new int[]{0, 1});
        Assert.assertEquals(missingNumber, 2);
    }

    @Test
    public void missingNumber1() {
        int missingNumber = new MissingNumber().missingNumber(new int[]{1});
        Assert.assertEquals(missingNumber, 0);
    }

    @Test
    public void missingNumber2() {
        int missingNumber = new MissingNumber().missingNumber(new int[]{1,2});
        Assert.assertEquals(missingNumber, 0);
    }
}