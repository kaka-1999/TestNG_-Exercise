package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class ITestListenerBase implements ITestListener {
    //有@Test标注的方法，开始执行时执行
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("onTestStart------------"+iTestResult.getMethod().getMethodName());
    }

    //有@Test标注的方法，执行成功后执行
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("onTestSuccess------------"+iTestResult.getMethod().getMethodName());
    }

    //有@Test标注的方法，执行失败后执行
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("onTestFailure------------"+iTestResult.getMethod().getMethodName());
    }

    //有@Test标注的方法，执行被忽略后执行
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("onTestSkipped------------"+iTestResult.getMethod().getMethodName());
    }

    //有@Test标注的方法，若方法中有6个断言通过5个，即执行
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("onTestFailedButWithinSuccessPercentage------------"+iTestResult.getMethod().getMethodName());
    }

    //xml文件中test标签执行前执行
    public void onStart(ITestContext iTestContext) {
        System.out.println("onStart------------"+iTestContext.getName());
        ITestNGMethod method[]=iTestContext.getAllTestMethods();
        for (ITestNGMethod mo:method){
            System.out.println("运行的方法有------------"+mo.getMethodName());
        }

    }

    //xml文件中test标签执行结束后执行
    public void onFinish(ITestContext iTestContext) {
        System.out.println("onFinish------------"+iTestContext.getName());
        ITestNGMethod method[]=iTestContext.getAllTestMethods();
        for (ITestNGMethod mo:method){
            System.out.println("运行的方法有------------"+mo.getMethodName());
        }
    }
}
