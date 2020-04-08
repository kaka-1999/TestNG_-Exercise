package Log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class log4j2_testng {
    WebDriver driver;
    String url;
    Logger logger= LogManager.getLogger(log4j2_testng.class.getName());
    @BeforeClass
    public void BeforeClass(){
        driver=new FirefoxDriver();
        url="https://www.baidu.com";
        driver.manage().window().maximize();
        logger.info("最大化浏览器");

    }
    @Test
    public void test(){
        driver.get(url);
        logger.info("打开网址");
    }
    @AfterClass
    public void AfterClass(){
        driver.close();
        logger.info("关闭浏览器");
    }
}
