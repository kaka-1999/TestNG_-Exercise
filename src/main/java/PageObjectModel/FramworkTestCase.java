package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FramworkTestCase {
    WebDriver driver;
    String url;
    FreeCoursePageFactory freeCoursePageFactory;

    @BeforeClass
    public void BeforeClass() {
        url = "https://www.imooc.com";
        driver = new FirefoxDriver();
        freeCoursePageFactory = new FreeCoursePageFactory(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }

    @Test
    public void Click() {
        freeCoursePageFactory.clickFreeCourse();
        freeCoursePageFactory.clickTestAndMaintain();
        freeCoursePageFactory.clickMiddle();
    }
}
