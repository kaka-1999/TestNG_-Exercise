package ParameterAndParrallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumParameterParallelExample {
    WebDriver webDriver;
    String url;

    @BeforeTest
    @Parameters({"brower"})
    public void setUp(String brower) throws InterruptedException {
        url = "https://www.imooc.com/";
        if (brower.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "C:\\Users\\gu\\IdeaProjects\\TestNG_-Exercise\\IEDriverServer.exe");
            webDriver = new InternetExplorerDriver();
            webDriver.get(url);
        } else if (brower.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.firefox.driver", "C:\\Users\\gu\\IdeaProjects\\TestNG_-Exercise\\geckodriver.exe");
            webDriver = new FirefoxDriver();
            webDriver.get(url);
            Thread.sleep(5000);
        }
    }

    @Test
    public void Login() throws InterruptedException {
        WebElement loginLink = webDriver.findElement(By.id("js-signin-btn"));
        Thread.sleep(10000);
        loginLink.click();

        WebElement userName = webDriver.findElement(By.xpath("//input[starts-with(@placeholder,'请输入登录手机号')]"));
        Thread.sleep(10000);
        userName.sendKeys("13888888888");
        WebElement passWord = webDriver.findElement(By.xpath("//input[starts-with(@placeholder,'请输入密码')]"));
        Thread.sleep(10000);
        passWord.sendKeys("123456");
        WebElement btn_login = webDriver.findElement(By.xpath("//input[@value='登录']"));
        btn_login.click();
    }

}
