package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.Pages;

import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

public class LoginStepDefinitions {
    Pages pages=new Pages();

    @Given("User goes to url")
    public void userGoesToUrl() {
     Driver.getAppiumDriver().get("https://www.kitapyurdu.com");
    }

    @When("User click to loginButton")
    public void userClickToLoginButton() {
        ReusableMethods.tapOn(pages.homePage().myAccountIcon);
    }

    @And("User send {string} to email box")
    public void userSendToEmailBox(String email) {
        pages.homePage().emailBox.sendKeys(ConfigReader.getProperty(email));
    }

    @And("User send {string} to password box")
    public void userSendToPasswordBox(String password) {
        pages.homePage().passwordBox.sendKeys(ConfigReader.getProperty(password),Keys.ENTER);
    }

    @And("User click loginButton on login page")
    public void userClickLoginButtonOnLoginPage() {

      //  ReusableMethods.clickElement(screens.homeScreens().loginButton);
      // ReusableMethods.tapOn(screens.homeScreens().loginButton);
    }

    @Then("User see hesabim text")
    public void userSeeHesabimText() {
        ReusableMethods.isElementPresent(pages.homePage().loginText);
    System.out.println(
        "screens.homeScreens().loginText.getText() = " + pages.homePage().loginText.getText());
    }

    @When("User clear the cookies")
    public void userClearTheCookies() {
       Driver.getAppiumDriver().manage().deleteAllCookies();
    }

    @And("User verifies the email on the header equal with {string}")
    public void userVerifiesTheEmailOnTheHeaderEqualWith(String validEmail) {
        Assert.assertTrue(pages.homePage().userEmailHeader.getText().contains(ConfigReader.getProperty(validEmail)));
    }
}
