package Annotation;

import org.testng.annotations.*;

/**
 * xml中groups设置
 * 方式1：run标签中的inlcude直接绑定groups
 * 方式2：define中设置groups，run标签中的inlcude直接绑定define标签的name值
 */
public class GroupsTest {
    /**
     * groups模式执行用例时，默认before和after方法不执行，若需要执行可通过添加alwaysRun = true参数
     */
    @BeforeClass(alwaysRun = true)
    public void BeforeClassTest() {
        System.out.println("-----GroupsTest-----------BeforeClassTest------");
    }

    @BeforeMethod
    public void BeforeMethodTest() {
        System.out.println("-----GroupsTest-----------BeforeMethodTest------");
    }

    @Test(groups = {"car", "suv"})
    public void TestMethod001() {
        System.out.println("-----GroupsTest-----------TestMethod001------groups = {\"car\", \"suv\"}");
    }

    @Test(groups = {"car", "kaka"})
    public void TestMethod002() {
        System.out.println("-----GroupsTest-----------TestMethod002------groups = {\"car\", \"kaka\"}");
    }

    @Test(groups = {"bike"})
    public void TestMethod003() {
        System.out.println("-----GroupsTest-----------TestMethod001------groups = {\"bike\"}");
    }

    @Test(groups = {"bike"})
    public void TestMethod004() {
        System.out.println("-----GroupsTest-----------TestMethod002------groups = {\"bike\"}");
    }

    @AfterMethod
    public void AfterMethodTest() {
        System.out.println("-----GroupsTest-----------AfterMethodTest------");
    }

    @AfterClass
    public void AfterClassTest() {
        System.out.println("-----GroupsTest-----------AfterClassTest------");
    }
}
