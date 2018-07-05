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

    @Test
    public void FiveReturnsBuzz() {
        Assert.assertEquals("Buzz", fizzbuzz.convert(5));
    }

    @Test
    public void FifteenReturnsFizzBuzz() {
        Assert.assertEquals("FizzBuzz", fizzbuzz.convert(15));
    }

}
