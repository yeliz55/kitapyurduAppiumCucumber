package stepDefinitions.androidStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import screens.Screen;
import utils.ConfigReader;
import utils.Driver;

public class LoginStepDefinition extends Screen {
    @Given("Android  on the main screen")
    public void androidOnTheMainScreen() {
        Driver.getAppiumDriver();

    }

    @And("Android clicks to my account icon")
    public void androidClicksToMyAccountIcon() throws InterruptedException {
        Thread.sleep(10);
       tapOn(homeScreen().myAccount);

    }

    @And("Android enters {string} to email checkbox")
    public void androidEntersToEmailCheckbox(String email) throws InterruptedException {
        Thread.sleep(5);
        enterKeys(loginScreen().ePostAddressBox, ConfigReader.getProperty(email));

    }

    @And("Android enters {string} to password checkbox")
    public void androidEntersToPasswordCheckbox(String password) {
        enterKeys(loginScreen().passwordBox, ConfigReader.getProperty(password));
    }

    @And("Android clicks login button")
    public void androidClicksLoginButton() {
        tapOnElementWithText("Giriş Yap");
    }

    @Then("Android verifies logged in")
    public void androidVerifiesLoggedIn() {
        wait(5);
    Assert.assertTrue(registerScreen().verifiesAccount.getText().contains(ConfigReader.getProperty("validEmail")));
    }
}
