package PageObjectModel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreeCoursePageFactory {
    WebDriver driver;

    /**
     * 查找元素
     * @FindBy唯一查找
     * @FindBys 相当于是取交集
     * @FindAll相当于是取并集
     */
    @FindBy(xpath = "//a[text()='免费课程']")
    WebElement freeCourseLink;

    @FindBy(xpath = "//a[text()='运维&测试']")
    WebElement testAndMaintainLink;

    @FindBy(xpath = "//a[text()='中级']")
    WebElement middleLink;

    /**
     * 点击查找的元素
     *
     */
    public void clickFreeCourse() {
        freeCourseLink.click();
    }

    public void clickTestAndMaintain() {
        testAndMaintainLink.click();
    }

    public void clickMiddle() {
        middleLink.click();
    }

    public FreeCoursePageFactory(WebDriver driver) {
        this.driver = driver;
        //用完findby后，需要进行元素初始化
        PageFactory.initElements(driver, this);
    }
}
