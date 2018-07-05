package FizzBuzz;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    App fizzbuzz = new App();

    @Test
    public void ThreeReturnsFizz() {
        Assert.assertEquals("Fizz", fizzbuzz.convert(3));

    }

    @Test
    public void ReturnsInput() {
        Assert.assertEquals("1", fizzbuzz.convert(1));
    }
}
