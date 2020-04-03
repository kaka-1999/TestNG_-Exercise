package ParameterAndParrallel;

import org.testng.annotations.Test;

public class ParrallelTest2 {
    @Test
    public void TestMehthod1() throws InterruptedException {
        System.out.println("----ParrallelTest2----------TestMehthod1--");
        Thread.sleep(5000);
    }

    @Test
    public void TestMehthod2() throws InterruptedException {
        System.out.println("----ParrallelTest2----------TestMehthod2--");
        Thread.sleep(5000);
    }
}
