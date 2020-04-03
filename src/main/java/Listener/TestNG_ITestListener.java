package Listener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ITestListenerBase.class)
public class TestNG_ITestListener {
    @Test
    public void sucessful() {
        System.out.println("TestNG_ITestListener------sucessful");
        Assert.assertEquals(true, true);
    }

    @Test
    public void failur() {
        System.out.println("TestNG_ITestListener------failur");
        Assert.assertEquals(true, false);
    }
}
