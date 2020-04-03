package Annotation;

import org.testng.annotations.*;

public class PriorityTest {
    /**
     * 优先级用的不多，最好独立执行，不影响其他的执行
     */
    @BeforeClass
    public void BeforeClassTest() {
        System.out.println("-----PriorityTest-----------BeforeClassTest------");
    }

    @BeforeMethod
    public void BeforeMethodTest() {
        System.out.println("-----PriorityTest-----------BeforeMethodTest------");
    }

    @Test(priority = 1)
    public void TestMethod001() {
        System.out.println("-----PriorityTest-----------TestMethod001------");
    }

    @Test(priority = 0)
    public void TestMethod002() {
        System.out.println("-----PriorityTest-----------TestMethod002------");
    }

    @AfterMethod
    public void AfterMethodTest() {
        System.out.println("-----PriorityTest-----------AfterMethodTest------");
    }

    @AfterClass
    public void AfterClassTest() {
        System.out.println("-----PriorityTest-----------AfterClassTest------");
    }

}
