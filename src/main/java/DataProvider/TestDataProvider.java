package DataProvider;

import org.testng.annotations.Test;

public class TestDataProvider {
    @Test(dataProvider = "inputs", dataProviderClass = DataProviderBase.class)
    public void TestDataProviderMethod(String name, String age) {
        System.out.println("-----" + name + "----" + age + "------");
    }
}
