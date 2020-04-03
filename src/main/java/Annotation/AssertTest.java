package Annotation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest {
    /**
     * 一个方法中执行两个断言
     * 1.不添加softAssert.assertAll();即使断言失败也不会报错，所有代码都执行；
     * 2.添加softAssert.assertAll();所有代码都执行，但也会报错断言执行失败；
     */
    @Test
    public void TestAssert001(){
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(1,1);
        System.out.println("--");
        softAssert.assertEquals(1,2);
        System.out.println("--");
        softAssert.assertAll();

    }

}
