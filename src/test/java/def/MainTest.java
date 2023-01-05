package def;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void main() {
    }

    @Test
    public void method_Should_expected_When_condition() {
        Assert.assertArrayEquals(new int[]{1}, new int[]{1});
    }

}