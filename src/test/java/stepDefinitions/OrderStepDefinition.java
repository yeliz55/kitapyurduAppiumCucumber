package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.Pages;
import pages.RegisterPage;
import utils.ConfigReader;
import utils.Driver;

public class OrderStepDefinition extends Pages {

    RegisterStepDefinition register=new RegisterStepDefinition();
    @When("User ckicks accept button on popup")
    public void userCkicksAcceptButtonOnPopup() {
        if (homePage().acceptCookiePopUp.size()!=0) {
            jsclick(homePage().acceptCookiePopUp.get(0));
        }

    }

    @When("User adds a  physical product to basket")
    public void userAddsAPhysicalProductToBasket() {
     clickElement(orderPage().physicalProduct);
    }

    @And("User clicks add to basket button")
    public void userClicksAddToBasketButton() {
      /*  if (homePage().acceptCookiePopUp.size()!=0) {
            jsclick(homePage().acceptCookiePopUp.get(0));
        }*/
        clickElement(orderPage().addBasket);
    }

    @And("User clicks my basket icon")
    public void userClicksMyBasketIcon() {
        jsclick(orderPage().basketIcon);

    }

    @And("User clicks buy icon")
    public void userClicksBuyIcon() {
        jsclick(orderPage().buyIcon);

    }


    @And("The user fills in the information in the form with valid values")
    public void theUserFillsInTheInformationInTheFormWithValidValues() {
        register.userTypesToNameBox("a name");
        register.userTypesToLastNameBox("a last name");
        register.userTypesToEmailBox("email");
        register.userTypesToPasswordBox("password");
        wait(2);
        register.userTypesToConfirmationPasswordBox("password");
        wait(3);
        register.userClickPersonalDataPrivacyCheckBox();

    }

    @And("User cliks Add adress button")
    public void userCliksAddAdressButton() {
        jsclick(adressPage().addAdress);
    }


    @And("User fills in Address Form valid inputs")
    public void userFillsInAddressFormValidInputs() {
        enterKeys(adressPage().nameBox,register.fakeName);
        enterKeys(adressPage().lastNameBox,register.fakeLastName);
        jsclick(adressPage().countryButton);
        jsclick(adressPage().turkiyeButton);
        jsclick(adressPage().cityButton);
    jsclick(Driver.getAppiumDriver().
            findElement(By.xpath("//*[@data-name='"+ ConfigReader.getProperty("IlSeciniz")+"']")));
    jsclick(adressPage().districtButton);
        jsclick(Driver.getAppiumDriver().
                findElement(By.xpath("//*[@data-name='"+ ConfigReader.getProperty("IlceSeciniz")+"']")));
        jsclick(adressPage().neighborhoodDButton);
        jsclick(Driver.getAppiumDriver().
                findElement(By.xpath("//*[@data-name='"+ ConfigReader.getProperty("MahalleSeciniz")+"']")));
        enterKeys(adressPage().adressBox,ConfigReader.getProperty("Adress"));
        enterKeys(adressPage().telephoneBox,ConfigReader.getProperty("SabitTelefon"));
        enterKeys(adressPage().mobileTelephoneBox,ConfigReader.getProperty("MobileTelefon"));
        jsclick(adressPage().saveButton);


    }

    @Then("User verifies that they have successfully added the address")
    public void userVerifiesThatTheyHaveSuccessfullyAddedTheAddress() {
        isElementPresent(adressPage().verifyText);


    }

    @And("User cliks ok button")
    public void userCliksOkButton() {
        jsclick(adressPage().okButton);


    }

    @And("User clicks continue button")
    public void userClicksContinueButton() {
        jsclick(orderPage().continueButton);
    }

    @And("User clicks Bank transfer radio button")
    public void userClicksBankTransferRadioButton() {
        jsclick(orderPage().bankTransferRadioBox);
    }

    @And("User clicks preinformation check box")
    public void userClicksPreinformationCheckBox() {
        jsclick(orderPage().checkBox);
    }

    @And("User confirm order button")
    public void userConfirmOrderButton() {
        jsclick(orderPage().continueButton);//continue ile order button aynı locate sahip
    }

    @Then("User verifies order created message is visible")
    public void userVerifiesOrderCreatedMessageIsVisible() {
    Assert.assertTrue(
        orderPage()
            .orderCreatMessage
            .getText()
            .contains("Siparişiniz oluşturuldu."));
    }
}
