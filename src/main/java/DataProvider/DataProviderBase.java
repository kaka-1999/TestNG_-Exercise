package DataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderBase {
    @DataProvider(name = "inputs")
    public Object[][] getDataProvider() {
        return new Object[][]{
                {"张三", "20"},
                {"王五", "30"}
        };
    }
}
