package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.Pages;
import pages.RegisterPage;

public class OrderStepDefinition extends Pages {

    RegisterStepDefinition register=new RegisterStepDefinition();
    @When("User ckicks accept button on popup")
    public void userCkicksAcceptButtonOnPopup() {
        if (homePage().acceptCookiePopUp.size()!=0) {
            jsclick(homePage().acceptCookiePopUp.get(0));
        }

    }

    @When("User adds a  physical product to basket")
    public void userAddsAPhysicalProductToBasket() {
     clickElement(orderPage().physicalProduct);
    }

    @And("User clicks add to basket button")
    public void userClicksAddToBasketButton() {
      /*  if (homePage().acceptCookiePopUp.size()!=0) {
            jsclick(homePage().acceptCookiePopUp.get(0));
        }*/
        clickElement(orderPage().addBasket);
    }

    @And("User clicks my basket icon")
    public void userClicksMyBasketIcon() {
        jsclick(orderPage().basketIcon);

    }

    @And("User clicks buy icon")
    public void userClicksBuyIcon() {
        jsclick(orderPage().buyIcon);

    }


    @And("The user fills in the information in the form with valid values")
    public void theUserFillsInTheInformationInTheFormWithValidValues() {
        register.userTypesToNameBox("a name");
        register.userTypesToLastNameBox("a last name");
        register.userTypesToEmailBox("email");
        register.userTypesToPasswordBox("password");
        wait(2);
        register.userTypesToConfirmationPasswordBox("password");
        wait(3);
        register.userClickPersonalDataPrivacyCheckBox();

    }

    @And("User cliks Add adress button")
    public void userCliksAddAdressButton() {
        jsclick(adressPage().addAdress);
    }
}
