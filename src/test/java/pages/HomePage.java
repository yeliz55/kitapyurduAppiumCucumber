package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class HomePage {
  public HomePage() {
    PageFactory.initElements(
        new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)), this);
  }

  @AndroidFindBy(xpath = "//a[contains(@class,'main-header')]//i[contains(@class,'main')]")
  public MobileElement myAccountIcon2;

  @FindBy(xpath = "//a[contains(@class,'main-header')]//i[contains(@class,'main')]")
  public WebElement myAccountIcon;

  // ONEMLI NOT: WebChromium (mobil uygulamalari chrome uzerinden acma) uzerinden calismak istersek
  // browser uzerinden
  //   ilerledigimiz icin Screens de @AndroidFindBy ve MobileElement calismiyor. Bu yuzden @FindBy
  // ve WebElement
  //   kullanmamiz gerekti.

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
