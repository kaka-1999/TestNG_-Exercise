package Test;

import org.testng.annotations.*;

public class SuiteTest {
    @BeforeSuite
    public void BeforeSuiteTest() {
        System.out.println("---SuiteTest----------BeforeSuiteTest-----");
    }

    @BeforeTest
    public void BeforeTestMethod() {
        System.out.println("---SuiteTest----------BeforeTestMethod-----");
    }

    @BeforeClass
    public void BeforeClassTest() {
        System.out.println("---SuiteTest----------BeforeClassTest-----");
    }

    @AfterClass
    public void AfterClassTest() {
        System.out.println("---SuiteTest----------AfterClassTest-----");
    }

    @AfterTest
    public void AfterTestMethod() {
        System.out.println("---SuiteTest----------AfterTestMethod-----");
    }

    @AfterSuite
    public void AfterSuiteTest() {
        System.out.println("---SuiteTest----------AfterSuiteTest-----");
    }
}
