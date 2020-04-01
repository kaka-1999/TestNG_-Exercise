package Test;

import org.testng.annotations.*;

public class TestCase001 extends SuiteTest {

    @BeforeClass
    public void BeforeClassTest() {
        System.out.println("-----TestCase001-----------BeforeClassTest------");
    }

    @BeforeMethod
    public void BeforeMethodTest() {
        System.out.println("-----TestCase001-----------BeforeMethodTest------");
    }

    @Test
    public void TestMethod001() {
        System.out.println("-----TestCase001-----------TestMethod001------");
    }

    @Test
    public void TestMethod002() {
        System.out.println("-----TestCase001-----------TestMethod002------");
    }

    @AfterMethod
    public void AfterMethodTest() {
        System.out.println("-----TestCase001-----------AfterMethodTest------");
    }

    @AfterClass
    public void AfterClassTest() {
        System.out.println("-----TestCase001-----------AfterClassTest------");
    }

}
