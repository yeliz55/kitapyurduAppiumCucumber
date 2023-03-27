package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }

    @FindBy(xpath = "//*[@class=\"main-sprite icon-header-account-nologin d-block\"]")
    public WebElement myAccountWebElement;

    @FindBy(xpath = "//*[@class=\"btn btn-outline-orange-x-dark fw-bold mt-4 p-3 text-decoration-none w-100\"]")
    public WebElement registerButton;




}
