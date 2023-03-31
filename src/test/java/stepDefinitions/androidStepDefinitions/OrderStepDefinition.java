package stepDefinitions.androidStepDefinitions;

import io.cucumber.java.en.And;
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
        wait(10);
        tapOnButtonWithText(text);


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
        wait(5);
        tapOnElementWithText(text);
    }

    @And("Android clicks Sepetim button")
    public void androidClicksSepetimButton() {
        wait(3);
        tapOn(orderScreen().myBasket);
    }
}
