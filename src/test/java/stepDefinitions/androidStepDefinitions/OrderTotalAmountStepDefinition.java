package stepDefinitions.androidStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screens.Screen;

public class OrderTotalAmountStepDefinition extends Screen {
    @And("Android clicks the homepage icon")
    public void androidClicksTheHomepageIcon() {
        tapOn(orderScreen().homePageIcon);
    }

    @When("Android clicks on the second item")
    public void androidClicksOnTheSecondItem() {
        tapOn(orderScreen().secondProduct);
    }

    @Then("Android confirms the total amount")
    public void androidConfirmsTheTotalAmount() {
        Double totalPrice=0.0;

    }
}
