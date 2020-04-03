package ParameterAndParrallel;

import org.testng.annotations.Test;

/**
 * parallel="methods":指定当前类中的method并行运行
 * parallel="tests":指定以test标签为维度并行运行
 */
public class ParrallelTest1 {
    @Test
    public void TestMehthod1() throws InterruptedException {
        System.out.println("----ParrallelTest1----------TestMehthod1--");
        Thread.sleep(5000);
    }

    @Test
    public void TestMehthod2() throws InterruptedException {
        System.out.println("----ParrallelTest1----------TestMehthod2--");
        Thread.sleep(5000);
    }
}
