package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PageObjectModel {
    WebDriver driver;
    String url;

    @BeforeClass
    public void BeforeClass() {
        url = "https://www.imooc.com";
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void ClickLink() {
        driver.get(url);
        HomePag.ClickFreeCourse(driver);
        HomePag.ClicktestAndMaintain(driver);
        HomePag.Clickmiddle(driver);
    }
}
