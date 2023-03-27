package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class RegisterPage {
    public RegisterPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }

    @FindBy(xpath = "//*[@id=\"firstname\"]")
    public WebElement nameBox;

    @FindBy(xpath = "//*[@id=\"lastname\"]")
    public WebElement lastNameBox;

    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@id=\"confirm\"]")
    public WebElement passwordConfirmBox;

    @FindBy(xpath = "//*[@id=\"form-check-input\"]")
    public WebElement personalDataPrivacyBox;

    @FindBy(xpath = "//*[@class=\"btn btn-primary text-white fw-bolder p-3 w-100 mb-3\"]")
    public WebElement registerButton;

    @FindBy(xpath = "//*[@class=\"fs-24 fw-bold mt-4 text-green-dark\"]")
    public WebElement accountCreatedMessageText;




}
