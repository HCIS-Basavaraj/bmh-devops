import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLoopingTest {

    LoopingIT loopingIT = new LoopingIT();

    @Test
    public void verifyDoWhileLoop() {
        Assert.assertTrue(loopingIT.doWhileLoop(4), "do...while loop not found");
    }
    @Test
    public void verifyWhileLoop() {
        Assert.assertTrue(loopingIT.whileLoop(4), "While loop not found");
    }
    @Test
    public void verifyForLoop() {
        Assert.assertTrue(loopingIT.forLoop(4), "for loop not found");
    }
}
