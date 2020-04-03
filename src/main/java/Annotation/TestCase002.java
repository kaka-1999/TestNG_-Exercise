package Annotation;

import org.testng.annotations.*;

public class TestCase002 extends SuiteTest{

    @BeforeClass
    public void BeforeClassTest() {
        System.out.println("-----TestCase002-----------BeforeClassTest------");
    }

    @BeforeMethod
    public void BeforeMethodTest() {
        System.out.println("-----TestCase002-----------BeforeMethodTest------");
    }

    @Test
    public void TestMethod001() {
        System.out.println("-----TestCase002-----------TestMethod001------");
    }

    @Test
    public void TestMethod002() {
        System.out.println("-----TestCase002-----------TestMethod002------");
    }

    @AfterMethod
    public void AfterMethodTest() {
        System.out.println("-----TestCase002-----------AfterMethodTest------");
    }

    @AfterClass
    public void AfterClassTest() {
        System.out.println("-----TestCase002-----------AfterClassTest------");
    }

}
