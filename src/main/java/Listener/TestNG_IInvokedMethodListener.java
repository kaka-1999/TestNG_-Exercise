package Listener;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_IInvokedMethodListener {
    @BeforeClass
    public void BeforeClass() {
        System.out.println("TestNG_IInvokedMethodListener-----------BeforeClass");
    }

    @AfterClass
    public void AfterClass() {
        System.out.println("TestNG_IInvokedMethodListener-----------AfterClass");
    }

    @Test
    public void Method01() {
        System.out.println("TestNG_IInvokedMethodListener-----------Method01");
    }

    @Test
    public void Method02() {
        System.out.println("TestNG_IInvokedMethodListener-----------Method02");
    }
}
