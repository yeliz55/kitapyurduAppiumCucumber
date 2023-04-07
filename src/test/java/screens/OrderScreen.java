package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class OrderScreen {
    public OrderScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }

    @AndroidFindBy(xpath = "(//android.widget.ImageView)[4]")
    public MobileElement firstProduct;

  @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Sepetim\"]/android.widget.ImageView")
  public MobileElement myBasket;

    @AndroidFindBy(id = "android:id/button2")
    public MobileElement loginRegisterButton;

    @AndroidFindBy(id = "com.mobisoft.kitapyurdu:id/registerButton")
    public MobileElement registerButton;

    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/imageViewRadioButton")
    public MobileElement radioButton;

    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/textViewTotal")
    public MobileElement addBasketPrice;


    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/checkBoxAgreement")
    public MobileElement checkBox;

    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/orderCompleteMessageTextView")
    public MobileElement messageTextVerifies;

   @AndroidFindBy(id="android:id/button3")
   public List<MobileElement> tamamButton;

   @AndroidFindBy(
      xpath = "//android.widget.FrameLayout[@content-desc=\"Ana Sayfa\"]/android.widget.ImageView")
   public MobileElement homePageIcon;

    @AndroidFindBy(xpath="(//android.widget.ImageView)[5]")
    public MobileElement secondProduct;

    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/textViewTotalPrice")
    public List<MobileElement> priceProduct;

    @AndroidFindBy(xpath="(//android.widget.TextView)[12]")
    public List<MobileElement> subTotal;

    @AndroidFindBy(xpath="(//android.widget.TextView)[16]")
    public List<MobileElement> shippingCost;

    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/textViewTotal")
    public List<MobileElement> totalAmount;

}
