package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class RegisterScreen {
  public RegisterScreen() {
    PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
  }

  @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Ad:\"]")
  public MobileElement nameBox;

  @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Soyad:\"]")
  public MobileElement lastNameBox;

  @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"E-posta Adresi:\"]")
  public MobileElement emailBox;

  @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Şifre:\"]")
  public MobileElement passwordBox;

  @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Şifre Tekrarı:\"]")
  public MobileElement confirmPasswordBox;

  @AndroidFindBy(id = "com.mobisoft.kitapyurdu:id/aggreement")
  public MobileElement checkBox;

  @AndroidFindBy(id = "com.mobisoft.kitapyurdu:id/btnRegister")
  public MobileElement registerButton;

  @AndroidFindBy(id = "com.mobisoft.kitapyurdu:id/textViewMail")
  public MobileElement verifiesAccount;



}
