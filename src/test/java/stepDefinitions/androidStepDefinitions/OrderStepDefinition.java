package stepDefinitions.androidStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import screens.Screen;
import utils.ConfigReader;
import utils.Driver;

public class OrderStepDefinition extends Screen {
    RegisterStepDefinition registerStepDefinition=new RegisterStepDefinition();

    @When("Android clicks a physical product")
    public void androidClicksAPhysicalProduct() {
        tapOn(orderScreen().firstProduct);

    }
    @And("Android clicks {string} button")
    public void androidClicksButton(String text) {
        //wait(10);
       // tapOnButtonWithText(text);
        tapOn(orderScreen().loginRegisterButton);


    }



    @And("Android fills in the information in the form with valid values")
    public void androidFillsInTheInformationInTheFormWithValidValues() {
        registerStepDefinition.androidTypesToNameBox("a name");
        registerStepDefinition.androidTypesToLastNameBox("a last name");
        registerStepDefinition.androidTypesToEmailBox("email");
        registerStepDefinition.androidTypesToPasswordBox("password");
        registerStepDefinition.androidTypesToConfirmationPasswordBox("password");
        registerStepDefinition.androidClickPersonalDataPrivacyCheckBox();
        registerStepDefinition.androidClickRegisterButtonOnRegisterPage();


    }

    @And("Android clicks {string} with text view")
    public void androidClicksWithTextView(String text) {
        wait(10);
        tapOnElementWithText(text);
    }

    @And("Android clicks Sepetim button")
    public void androidClicksSepetimButton() {
        wait(5);
        tapOn(orderScreen().myBasket);
    }

    @And("Android clicks Uye Ol button")
    public void androidClicksUyeOlButton() {
        tapOn(orderScreen().registerButton);
    }

    @And("The Android fills in the information on the address page")
    public void theAndroidFillsInTheInformationOnTheAddressPage() {
        wait(3);
        enterKeys(adressScreen().nameBox,registerStepDefinition.fakeName);
        enterKeys(adressScreen().lastNameBox,registerStepDefinition.fakeLastName);

        tapOnButtonWithText("Türkiye");
        tapOnElementWithText("Türkiye");


        tapOn(adressScreen().cityBox);
        enterKeys(adressScreen().searchBox,ConfigReader.getProperty("IlSeciniz"));
        tapOnElementWithText(ConfigReader.getProperty("IlSeciniz"));

       tapOn(adressScreen().districtBox);
        enterKeys(adressScreen().searchBox,ConfigReader.getProperty("IlceSeciniz"));
        tapOnElementWithText(ConfigReader.getProperty("IlceSeciniz"));


        tapOn(adressScreen().neighborhoodBox);
        enterKeys(adressScreen().searchBox,ConfigReader.getProperty("MahalleSeciniz"));
        tapOnElementWithText(ConfigReader.getProperty("MahalleSeciniz"));


       enterKeys(adressScreen().adressBox, ConfigReader.getProperty("Adress"));
       enterKeys(adressScreen().telephoneBox, ConfigReader.getProperty("SabitTelefon"));
       enterKeys(adressScreen().mobileTelephoneBox, ConfigReader.getProperty("MobileTelefon"));
       tapOn(adressScreen().insertButton);
    }


    @And("Android clicks BankTransfer Radio Button")
    public void androidClicksBankTransferRadioButton() {
        wait(5);
        if (orderScreen().tamamButton.isDisplayed()){
            tapOnButtonWithText("Tamam");
            tapOn(orderScreen().radioButton);
        }else  tapOn(orderScreen().radioButton);



    }

    @And("Android verifies total price")
    public void androidVerifiesTotalPrice() {
    Assert.assertTrue(orderScreen().addBasketPrice.isDisplayed());
    }

    @And("Android clicks preInformation checkBox")
    public void androidClicksPreInformationCheckBox() {
        tapOn(orderScreen().checkBox);
    }


    @And("Android verifies the order is created")
    public void androidVerifiesTheOrderIsCreated() {
       Assert.assertTrue(orderScreen().messageTextVerifies.getText().contains("siparişiniz başarıyla tamamlandı!"));
    }

}
