package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class RegisterPage {
  public RegisterPage() {
    PageFactory.initElements(
        new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)), this);
  }

  @FindBy(xpath = "//a[contains(@class,'btn btn-outline')]")
  public WebElement register;

  @FindBy(xpath = "//input[contains(@id,'firstname')]")
  public WebElement nameBox;

  @FindBy(xpath = "//input[contains(@id,'lastname')]")
  public WebElement lastNameBox;

  @FindBy(xpath = "//input[contains(@id,'email')]")
  public WebElement emailBox;

  @FindBy(xpath = "//input[contains(@id,'pass')]")
  public WebElement passwordBox;

  @FindBy(xpath = "//input[contains(@id,'confirm')]")
  public WebElement confirmPasswordBox;

  @FindBy(xpath = "//input[@id=\"form-check-input\"]")
  public WebElement checkBox;

  @FindBy(xpath = "//button[contains(@class,\"btn btn-primary \")]")
  public WebElement registerButton;

  @FindBy(xpath = "//*[@class='fs-24 fw-bold mt-4 text-green-dark']")
  public WebElement accountText;

  @FindBy(xpath = "//*[@id='js-popup-accept-button']")
  public WebElement admitText;
}
