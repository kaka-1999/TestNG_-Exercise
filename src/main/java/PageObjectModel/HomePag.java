package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePag {
    static WebElement element;

    /**
     * 获取免费课程元素
     */
    public static WebElement freeCourselink(WebDriver driver) {
        element = driver.findElement(By.xpath("//a[text()='免费课程']"));
        return element;
    }

    /**
     * 获取运维&测试元素
     */
    public static WebElement testAndMaintainlink(WebDriver driver) {
        element = driver.findElement(By.xpath("//a[text()='运维&测试']"));
        return element;
    }

    /**
     * 获取中级元素
     */
    public static WebElement middlelink(WebDriver driver) {
        element = driver.findElement(By.xpath("//a[text()='中级']"));
        return element;
    }

    /**
     * 点击免费课程元素
     */
    public static void ClickFreeCourse(WebDriver driver) {
        freeCourselink(driver).click();
    }

    /**
     * 点击运维&测试元素
     */
    public static void ClicktestAndMaintain(WebDriver driver) {
        testAndMaintainlink(driver).click();
    }

    /**
     * 点击中级元素
     */
    public static void Clickmiddle(WebDriver driver) {
        middlelink(driver).click();
    }
}
