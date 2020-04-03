package Listener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ISuiteListenerBase.class)
public class TestNG_ISuiteListener {
    @Test
    public void sucessful() {
        System.out.println("TestNG_ISuiteListener------sucessful");
        Assert.assertEquals(true, true);
    }

    @Test
    public void failur() {
        System.out.println("TestNG_ISuiteListener------failur");
        Assert.assertEquals(true, false);
    }
}
