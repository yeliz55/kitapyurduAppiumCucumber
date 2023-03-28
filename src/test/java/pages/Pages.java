package pages;

import utils.ReusableMethods;

public class Pages extends ReusableMethods {
    public Pages(){

    }

    private HomePage homePage;
    private LoginPage loginPage;
    private RegisterPage registerPage;

    private OrderPage orderPage;
    private AdressPage adressPage;

    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }



    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public RegisterPage registerPage() {
        if (registerPage == null) {
            registerPage = new RegisterPage();
        }
        return registerPage;
    }


    public OrderPage orderPage() {
        if (orderPage == null) {
            orderPage = new OrderPage();
        }
        return orderPage;
    }

    public AdressPage adressPage() {
        if (adressPage == null) {
            adressPage = new AdressPage();
        }
        return adressPage;
    }


}
