package Listener;

import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;

public class ISuiteListenerBase implements ISuiteListener {
    //xml文件中，suite标签运行前执行
    public void onStart(ISuite iSuite) {
        System.out.println("ISuiteListenerBase------" + iSuite.getName());
    }

    //xml文件中，suite标签运行后执行

    public void onFinish(ISuite iSuite) {
        System.out.println("ISuiteListenerBase------" + iSuite.getName());
    }
}
