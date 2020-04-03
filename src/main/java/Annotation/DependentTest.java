package Annotation;

import org.testng.annotations.*;

public class DependentTest {

    @BeforeClass
    public void BeforeClassTest() {
        System.out.println("-----DependentTest-----------BeforeClassTest------");
    }

    @BeforeMethod
    public void BeforeMethodTest() {
        System.out.println("-----DependentTest-----------BeforeMethodTest------");
    }

    /**
     * dependsOnMethods:指定依赖方法
     * 未添加依赖方法的case执行时间为随机
     */
    @Test(dependsOnMethods = "TestMethod002")
    public void TestMethod001() {
        System.out.println("-----DependentTest-----------TestMethod001------");
    }

    @Test
    public void TestMethod002() {
        System.out.println("-----DependentTest-----------TestMethod002------");
    }

    /**
     * 若想忽略依赖方法，可添加alwaysRun = true，即依赖方法运行失败也会运行此方法
     */
    @Test(dependsOnMethods = "TestMethod001",alwaysRun = true)
    public void TestMethod003() {
        System.out.println("-----DependentTest-----------TestMethod003------");
    }

    @Test
    public void TestMethod004() {
        System.out.println("-----DependentTest-----------TestMethod004------");
    }

    @AfterMethod
    public void AfterMethodTest() {
        System.out.println("-----DependentTest-----------AfterMethodTest------");
    }

    @AfterClass
    public void AfterClassTest() {
        System.out.println("-----DependentTest-----------AfterClassTest------");
    }
}
