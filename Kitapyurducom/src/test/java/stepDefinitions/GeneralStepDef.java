package stepDefinitions;

import io.cucumber.java.en.Given;
import org.aspectj.weaver.Shadow;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.Driver;
import utils.DriverS;

import java.net.MalformedURLException;

public class GeneralStepDef {
    @Given("User goes to url")
    public void userGoesToUrl() {
        Driver.getAppiumDriver().get("https://www.kitapyurdu.com");

    }

    @Given("User goes to url on browserstack")
    public void userGoesToUrlOnBrowserStack() throws MalformedURLException {
        DriverS.getAppiumStackDriver().get("https://www.kitapyurdu.com");
        Assert.assertTrue(DriverS.getAppiumStackDriver().getTitle().contains("Kitapyurdu"));


    }


}
