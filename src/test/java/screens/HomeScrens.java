package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class HomeScrens {
  public HomeScrens() {
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


}
