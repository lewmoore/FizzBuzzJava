package FizzBuzz;

import org.junit.Assert;
import org.junit.Test;

public class AppTest 
{
    @Test
    public void ThreeReturnsFizz() {
        App fizzbuzz = new App();

        Assert.assertEquals("Fizz", fizzbuzz.convert(3));

    }
}
