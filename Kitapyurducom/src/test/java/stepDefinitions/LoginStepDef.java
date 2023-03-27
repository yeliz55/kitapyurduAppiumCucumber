package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Pages;
import utils.ConfigReader;
import utils.Driver;

public class LoginStepDef extends Pages {


    @When("User click to MyAccount Icon")
    public void userClickToMyAccountIcon() {
     clickElement(homePage().myAccountWebElement);

    }

    @And("User send {string} to email box")
    public void userSendToEmailBox(String email) {
        enterKeys(loginPage().emailBox, ConfigReader.getProperty(email));
    }

    @And("User send {string} to password box")
    public void userSendToPasswordBox(String password) {
        enterKeys(loginPage().passwordBox, ConfigReader.getProperty(password));
    }

    @And("User click loginButton on login page")
    public void userClickLoginButtonOnLoginPage() {
        clickElement(loginPage().loginButton);
    }

    @When("User clear the cookies")
    public void userClearTheCookies() {
        Driver.getAppiumDriver().manage().deleteAllCookies();


    }

    @Then("User see {string} text")
    public void userSeeText(String text) {
       isElementPresent(Driver.getAppiumDriver().findElementByXPath("//*[text()='"+text+"'"));

    }

    @And("User verifies the email on the header equal with {string}")
    public void userVerifiesTheEmailOnTheHeaderEqualWith(String validEmail) {
        Assert.assertTrue(loginPage().userEmailHeader.getText().contains(ConfigReader.getProperty(validEmail)));
    }
}
