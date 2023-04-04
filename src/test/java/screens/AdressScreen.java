package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class AdressScreen {
    public AdressScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)), this);
    }

    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/nameText")
    public MobileElement nameBox;

    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/surnameText")
    public MobileElement lastNameBox;

    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/nameText")
    public MobileElement emailBox;
    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/zoneSpinner")
    public MobileElement cityBox;

    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/countySpinner")
    public MobileElement districtBox;

    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/districtSpinner")
    public MobileElement neighborhoodBox;

    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/addressText")
    public MobileElement adressBox;

    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/postCode")
    public MobileElement postaCodeBox;

    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/telephone")
    public MobileElement telephoneBox;


    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/mobileTelephone")
    public MobileElement mobileTelephoneBox;

    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/identityId")
    public MobileElement tCBox;

    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/submitButton")
    public MobileElement insertButton;

    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/search_box")
    public MobileElement searchBox;




}
