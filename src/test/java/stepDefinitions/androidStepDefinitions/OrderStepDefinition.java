package stepDefinitions.androidStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screens.Screen;

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
        wait(5);
        enterKeys(adressScreen().nameBox,registerStepDefinition.fakeName);
        enterKeys(adressScreen().lastNameBox,registerStepDefinition.fakeLastName);
        tapOnButtonWithText("Türkiye");
        wait(3);
        scrollWithUiScrollable("Türkiye");
        wait(3);
        enterKeys(adressScreen().cityBox,"Samsun");
        wait(3);
        scrollButtonWithUiScrollable("Samsun");

        tapOnButtonWithText("*İlçe");
        scrollWithUiScrollable("ATAKUM");
    }

    @Then("Android verifies that they have successfully added the address")
    public void androidVerifiesThatTheyHaveSuccessfullyAddedTheAddress() {
    }
}
