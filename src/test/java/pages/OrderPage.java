package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class OrderPage {
    public OrderPage() {
        PageFactory.initElements(
                new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)), this);
    }
    @FindBy(xpath = "//*[@src='https://img.kitapyurdu.com/v1/getImage/fn:11656593/wi:200/wh:true']")
    public WebElement physicalProduct;

    @FindBy(xpath = "//*[@id='js-add-to-cart']")
    public WebElement addBasket;

    @FindBy(xpath = "//*[@class='main-sprite icon-tabbar-cart']")
    public WebElement basketIcon;

    @FindBy(xpath = "//a[contains(@class,'justify-content-center')]")
    public WebElement buyIcon;


    @FindBy(xpath = "//a[contains(@class,'btn btn-outline-orange-x-dark')]]")
    public WebElement register;



}
