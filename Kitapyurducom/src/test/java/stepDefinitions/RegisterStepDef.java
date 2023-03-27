package stepDefinitions;

import io.cucumber.java.en.And;
import pages.Pages;

public class RegisterStepDef extends Pages {
    String fakeName, fakeLastname, fakeEmail,fakePassword;

    @And("User click to Register Button")
    public void userClickToRegisterButton() {
        clickElement(homePage().registerButton);
    }

    @And("User types {string} to name box")
    public void userTypesToNameBox(String name) {

        if (name.equals("a name")) {
            fakeName = getFaker().name().firstName();
            enterKeys(registerPage().nameBox, "TEST"+fakeName);
        } else enterKeys(registerPage().nameBox, name);

    }

    @And("User types {string} to last name box")
    public void userTypesToLastNameBox(String lastName) {
        if (lastName.equals("a last name")) {
            fakeLastname = getFaker().name().lastName();
            enterKeys(registerPage().lastNameBox, "TEST"+fakeLastname);
        } else enterKeys(registerPage().lastNameBox, lastName);
    }

    @And("User types {string} to email box")
    public void userTypesToEmailBox(String email) {
        if (email.equals("an email")) {
            fakeEmail = getFaker().internet().emailAddress();
            enterKeys(registerPage().emailBox, "TEST"+fakeEmail);
        } else enterKeys(registerPage().emailBox, email);
    }

    @And("User types {string} to password box")
    public void userTypesToPasswordBox(String password) {
        if (password.equals("a password")) {
            fakePassword = getFaker().internet().password();
            enterKeys(registerPage().passwordBox, fakePassword);
        } else enterKeys(registerPage().passwordBox, password);
    }

    @And("User types {string} to confirmation password box")
    public void userTypesToConfirmationPasswordBox(String arg0) {
        enterKeys(registerPage().passwordConfirmBox,fakePassword);
    }

    @And("User click personal data privacy check box")
    public void userClickPersonalDataPrivacyCheckBox() {
        if (!registerPage().personalDataPrivacyBox.isSelected()) jsclick(registerPage().personalDataPrivacyBox);
    }

    @And("User click Register Button")
    public void userClickRegisterButton() {
        jsclick(registerPage().registerButton);
    }

    @And("User verifies Account Created message is visible")
    public void userVerifiesAccountCreatedMessageIsVisible() {
        isElementPresent(registerPage().accountCreatedMessageText);
    }


}
