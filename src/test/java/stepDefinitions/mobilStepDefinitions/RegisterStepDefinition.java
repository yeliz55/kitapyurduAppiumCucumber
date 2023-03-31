package stepDefinitions.mobilStepDefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.Pages;

public class RegisterStepDefinition extends Pages {
    String fakeName,fakeLastName,fakeEmail,fakePassword;

    @And("User click to Register Button")
    public void userClickToRegisterButton() {
        clickElement(registerPage().register);

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
            fakeLastName = getFaker().name().lastName();
            enterKeys(registerPage().lastNameBox, "TEST"+fakeLastName);
        } else enterKeys(registerPage().nameBox, lastName);
    }

    @And("User types {string} to email box")
    public void userTypesToEmailBox(String email) {
        if (email.equals("email")) {
            fakeEmail = getFaker().internet().emailAddress();
            enterKeys(registerPage().emailBox, "TEST"+fakeEmail);
        } else enterKeys(registerPage().emailBox, email);
    }

    @And("User types {string} to password box")
    public void userTypesToPasswordBox(String password) {
        if (password.equals("password")) {
            fakePassword = "TEST"+getFaker().internet().password();
            enterKeys(registerPage().passwordBox, fakePassword);
        } else enterKeys(registerPage().passwordBox, password);
    }

    @And("User types {string} to confirmation password box")
    public void userTypesToConfirmationPasswordBox(String confirmPassword) {
     enterKeys(registerPage().confirmPasswordBox, fakePassword);
    }

    @And("User click personal data privacy check box")
    public void userClickPersonalDataPrivacyCheckBox() {
        if (homePage().acceptCookiePopUp.size()!=0) {
            jsclick(homePage().acceptCookiePopUp.get(0));
        }
       // clickElement(registerPage().admitText);
        jsclick(registerPage().checkBox);
    }

    @And("User click Register Button")
    public void userClickRegisterButton() {
      jsclick(registerPage().registerButton);

    }

    @And("User verifies Account Created message is visible")
    public void userVerifiesAccountCreatedMessageIsVisible() {
        Assert.assertEquals(registerPage().accountText.getText(),"Hesabınız Oluşturuldu!");
    }
}
