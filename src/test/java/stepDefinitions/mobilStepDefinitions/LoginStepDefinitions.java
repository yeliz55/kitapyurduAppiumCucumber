package stepDefinitions.mobilStepDefinitions;

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

public class LoginStepDefinitions extends  Pages{


    @Given("User goes to url")
    public void userGoesToUrl() {
     Driver.getAppiumDriver().get("https://www.kitapyurdu.com");
    }

    @When("User click to MyAccount Icon")
    public void userClickToMyAccountIcon() {
        tapOn(homePage().myAccountIcon);
    }

    @And("User send {string} to email box")
    public void userSendToEmailBox(String email) {
       loginPage().emailBox.sendKeys(ConfigReader.getProperty(email));
    }

    @And("User send {string} to password box")
    public void userSendToPasswordBox(String password) {
        loginPage().passwordBox.sendKeys(ConfigReader.getProperty(password),Keys.ENTER);
    }

    @And("User click loginButton on login page")
    public void userClickLoginButtonOnLoginPage() {

      //  ReusableMethods.clickElement(screens.homeScreens().loginButton);
      // ReusableMethods.tapOn(screens.homeScreens().loginButton);
    }

    @Then("User see hesabim text")
    public void userSeeHesabimText() {
     isElementPresent(loginPage().loginText);
    System.out.println(
        "screens.homeScreens().loginText.getText() = " + loginPage().loginText.getText());
    }

    @When("User clear the cookies")
    public void userClearTheCookies() {
       Driver.getAppiumDriver().manage().deleteAllCookies();
    }

    @And("User verifies the email on the header equal with {string}")
    public void userVerifiesTheEmailOnTheHeaderEqualWith(String validEmail) {
        Assert.assertTrue(loginPage().userEmailHeader.getText().contains(ConfigReader.getProperty(validEmail)));
    }
}
