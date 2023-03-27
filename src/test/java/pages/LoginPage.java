package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(
                new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)), this);

    }

    @FindBy(xpath = "//input[starts-with(@id,\"login-email\")]")
    public WebElement emailBox;

    @FindBy(xpath = "//input[starts-with(@id,\"login-password\")]")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[starts-with(@id,\"login-but\")]")
    public WebElement loginButton;

    @FindBy(xpath = "//div[contains(@class,\"fs-18 fw-bold mt-2 text-orange-dark\")]")
    public WebElement loginText;

    @FindBy(xpath = "//*[@class=\"fs-14 mb-3 text-gray\"]")
    public WebElement userEmailHeader;
}
