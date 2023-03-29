package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class AdressPage {
  public AdressPage() {
    PageFactory.initElements(
        new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)), this);
  }

  @FindBy(xpath = "//a[starts-with(@href,'index.php?route=account/add')]")
  public WebElement addAdress;

  @FindBy(xpath = "//input[starts-with(@id,'firstname_companyname')]")
  public WebElement nameBox;

  @FindBy(xpath = "//input[starts-with(@id,'last')]")
  public WebElement lastNameBox;

  @FindBy(xpath = "//a[starts-with(@id,'btn-modal-country')]")
  public WebElement countryButton;

  @FindBy(xpath = "//a[starts-with(@id,'btn-modal-zone')]")
  public WebElement cityButton;

  @FindBy(xpath = "//*[@id='county']")
  public WebElement districtButton;

  @FindBy(xpath = "//a[starts-with(@id,'btn-modal-district')]")
  public WebElement neighborhoodDButton;

  @FindBy(xpath = "//input[@id='address']")
  public WebElement adressBox;

  @FindBy(xpath = "//input[@id='postcode']")
  public WebElement postCodeBox;

  @FindBy(xpath = "//input[@id='telephone']")
  public WebElement telephoneBox;

  @FindBy(xpath = "//input[@id='mobile_telephone']")
  public WebElement mobileTelephoneBox;

  @FindBy(xpath = "//input[@id='tax_id']")
  public WebElement tcBox;

  @FindBy(xpath = "//button[@id='insert-address-button']")
  public WebElement saveButton;

  @FindBy(xpath = "//*[@data-name='Türkiye']")
  public WebElement turkiyeButton;

  @FindBy(xpath = "//*[@id=\"swal2-html-container\"]")
  public WebElement verifyText;

  @FindBy(xpath = "//*[contains(@class,'swal2-confirm')]")
  public WebElement okButton;
}
