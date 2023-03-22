package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Driver;

public class LoginStepDefinitions {
    @Given("User goes to url")
    public void userGoesToUrl() {
     Driver.getAppiumDriver().get("https://www.kitapyurdu.com");
    }

    @When("User click to loginButton")
    public void userClickToLoginButton() {
    }

    @And("User send {string} to email box")
    public void userSendToEmailBox(String arg0) {
    }

    @And("User send {string} to password box")
    public void userSendToPasswordBox(String arg0) {
    }

    @And("User click loginButton on login page")
    public void userClickLoginButtonOnLoginPage() {
    }

    @Then("User see hesabim text")
    public void userSeeHesabimText() {
    }

    @When("User clear the cookies")
    public void userClearTheCookies() {
    }
}
