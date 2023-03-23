package stepDefinitions;

import io.appium.java_client.MobileElement;
import io.cucumber.core.runtime.ScanningTypeRegistryConfigurerSupplier;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screens.HomeScrens;
import screens.Screens;
import utils.Driver;
import utils.ReusableMethods;

public class LoginStepDefinitions {
    Screens screens=new Screens();
    HomeScrens homeScrens=new HomeScrens();
    @Given("User goes to url")
    public void userGoesToUrl() {
     Driver.getAppiumDriver().get("https://www.kitapyurdu.com");
    }

    @When("User click to loginButton")
    public void userClickToLoginButton() {

        screens.homeScrens().myAccountIcon.click();


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
