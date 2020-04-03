package Annotation;

import org.testng.annotations.Test;

public class TimeoutTest {
    /**
     * 默认enabled = true，若enabled = false即不执行此case
     */
    @Test(enabled = false)
    public void TestMethod001() {
        System.out.println("-----TimeoutTest-----------TestMethod001------");
    }

    /**
     * timeOut参数可设置延迟时间，若超过此时间case自动标识失败
     */
    @Test(timeOut = 200)
    public void TestMethod002() throws InterruptedException {
        System.out.println("-----TimeoutTest-----------TestMethod002------");
        Thread.sleep(200);
    }
}

