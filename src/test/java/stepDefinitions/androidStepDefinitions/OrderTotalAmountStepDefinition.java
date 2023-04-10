package stepDefinitions.androidStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
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
        wait(5);
        Double totalPrice=0.0;
    for (int i = 0; i < orderScreen().priceProduct.size(); i++) {

        totalPrice+=Double.parseDouble(orderScreen().priceProduct.get(i).getText().substring(0,6).replace(",",".").replace(" ",""));
    }
    Double subTotal = Double.parseDouble(orderScreen().subTotal.getText().substring(0,6).replace(",",".").replace(" ",""));

    Double finalTotalPrice=Math.round(totalPrice*100.0) / 100.0;
    System.out.println("finalTotalPrice = " + finalTotalPrice);
    System.out.println("subTotal = " + subTotal);

    // toplam ile ara toplam dogrulama
    Assert.assertEquals(finalTotalPrice,subTotal);
    System.out.println(
        "orderScreen().shippingCost.getText() = " + orderScreen().shippingCost.getText());
    Double shippingCost= Double.parseDouble(orderScreen().shippingCost.getText().substring(0,5).replace(",",".").replace(" ",""));
    Double totalAmount= Double.parseDouble(orderScreen().totalAmount.getText().substring(0,6).replace(",",".").replace(" ",""));
    System.out.println("shippingCost = " + shippingCost);
    System.out.println("totalAmount = " + totalAmount);
    //kargo ve urunler toplam ile toplam tutar karsılastırılıyor
        Double total=finalTotalPrice+shippingCost;
        System.out.println("total = " + total);

        if (shippingCost==0.0){
            Assert.assertEquals(totalAmount,total);
        }else Assert.assertNotEquals(totalAmount,total);

    }

    @When("Android clicks on the third item")
    public void androidClicksOnTheThirdItem() {
        tapOn(orderScreen().thirdProduct);
    }
}
