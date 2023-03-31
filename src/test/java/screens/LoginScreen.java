package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class LoginScreen {
    public LoginScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }

    @AndroidFindBy(xpath = "//*[@id=\"firstname\"]")
    public MobileElement nameBox;

    @AndroidFindBy(id = "com.mobisoft.kitapyurdu:id/editTextMail")
    public MobileElement ePostAddressBox;

    @AndroidFindBy(id = "com.mobisoft.kitapyurdu:id/editTextPassword")
    public MobileElement passwordBox;



}
