package utils;


    import java.net.URL;
import java.util.List;
import java.util.function.Function;
import java.net.MalformedURLException;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
    import org.junit.Assert;
    import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
    public class BrowserStackSample {
        public static void main(String[] args) throws MalformedURLException, InterruptedException {

            DesiredCapabilities caps = new DesiredCapabilities();

            // Set your access credentials
            caps.setCapability("browserstack.user", "kitapyurdu_f7VsUH");
            caps.setCapability("browserstack.key", "MbQySGgMaGhpTXrUxitD");

            // Set URL of the application under test
            //caps.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");
            caps.setCapability("browser", "chrome");

            // Specify device and os_version for testing
            caps.setCapability("device", "Samsung Galaxy S23 Ultra");
            caps.setCapability("os_version", "13.0");

            // Set other BrowserStack capabilities
            caps.setCapability("project", "First Java Project");
            caps.setCapability("build", "browserstack-build-1");
            caps.setCapability("name", "first_test");


            // Initialise the remote Webdriver using BrowserStack remote URL
            // and desired capabilities defined above
            AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
                    new URL("http://hub.browserstack.com/wd/hub"), caps);

            driver.get("https://kitapyurdu.com");
            Assert.assertTrue(driver.getTitle().contains("Kitapyurdu"));


            // Invoke driver.quit() after the test is done to indicate that the test is completed.
            driver.quit();

        }
}
