package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindLink {
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

    public List<WebElement> getLink() {
        List<WebElement> list = new ArrayList<WebElement>();
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        elements.addAll(driver.findElements(By.tagName("img")));
        for (WebElement e : elements) {
            System.out.println("地址：" + url);
            if (e.getAttribute("href") != null) {
                e.click();
            }
        }
        return list;

    }

    public String LinkStatus(URL address) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) address.openConnection();
        connection.connect();
        String responseMessage = connection.getResponseMessage();
        connection.disconnect();
        return responseMessage;
    }

    @Test
    public void testLink() {
        List<WebElement> list = getLink();
        for (WebElement e : list) {
            String url = e.getAttribute("href");
            try {
                System.out.println("地址：" + url);
                System.out.println("状态：" + LinkStatus(new URL(url)));
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }

        }
    }
}
