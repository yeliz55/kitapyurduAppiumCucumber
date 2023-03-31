package stepDefinitions.androidStepDefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import screens.Screen;
import utils.ConfigReader;

public class RegisterStepDefinition extends Screen {
    String fakeName,fakeLastName,fakeEmail,fakePassword;
    @And("Android clicks Free Register Button")
    public void androidClicksFreeRegisterButton() {
        wait(10);
        tapOnElementWithText("Ücretsiz Üye Ol");

    }

    @And("Android types {string} to name box")
    public void androidTypesToNameBox(String name) {
        if (name.equals("a name")) {
            fakeName = getFaker().name().firstName();
            enterKeys(registerScreen().nameBox, "TEST"+fakeName);
        } else enterKeys(registerScreen().nameBox, name);

    }

    @And("Android types {string} to last name box")
    public void androidTypesToLastNameBox(String lastname) {
        if (lastname.equals("a last name")) {
            fakeLastName = getFaker().name().lastName();
            enterKeys(registerScreen().lastNameBox, "TEST"+fakeLastName);
        } else enterKeys(registerScreen().nameBox, lastname);

    }

    @And("Android types {string} to email box")
    public void androidTypesToEmailBox(String email) {
        if (email.equals("email")) {
            fakeEmail = getFaker().internet().emailAddress();
            enterKeys(registerScreen().emailBox, "TEST"+fakeEmail);
        } else enterKeys(registerScreen().emailBox, email);

    }

    @And("Android types {string} to password box")
    public void androidTypesToPasswordBox(String password) {
        if (password.equals("password")) {
            fakePassword = "TEST"+getFaker().internet().password();
            enterKeys(registerScreen().passwordBox, fakePassword);
        } else enterKeys(registerScreen().passwordBox, password);

    }

    @And("Android types {string} to confirmation password box")
    public void androidTypesToConfirmationPasswordBox(String confirmpassword) {
        enterKeys(registerScreen().confirmPasswordBox, fakePassword);
    }

    @And("Android click personal data privacy check box")
    public void androidClickPersonalDataPrivacyCheckBox() {
        wait(3);
        tapOn(registerScreen().checkBox);
    }

    @And("Android click Register Button on register page")
    public void androidClickRegisterButtonOnRegisterPage() {
     tapOn(registerScreen().registerButton);
    }

    @And("Android verifies Account Created message is visible")
    public void androidVerifiesAccountCreatedMessageIsVisible() {
    Assert.assertTrue(registerScreen().verifiesAccount.getText().contains(fakeEmail));
    }
}
