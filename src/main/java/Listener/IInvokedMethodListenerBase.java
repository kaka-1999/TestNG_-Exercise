package Listener;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class IInvokedMethodListenerBase implements IInvokedMethodListener {
    //类中每个方法运行前执行，包括BeforeClass，AfterClass等方法
    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        System.out.println("beforeInvocation-------------" + iTestResult.getMethod().getMethodName());
        System.out.println("beforeInvocation-------------" + iInvokedMethod.getTestMethod().getMethodName());
    }

    //类中每个方法运行后执行，包括BeforeClass，AfterClass等方法
    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        System.out.println("afterInvocation-------------" + iTestResult.getMethod().getMethodName());
        System.out.println("afterInvocation-------------" + iInvokedMethod.getTestMethod().getMethodName());
    }
}
