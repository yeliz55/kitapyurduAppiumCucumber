package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverS {
    private static AppiumDriver<MobileElement> appiumStackDriver;

    public static AppiumDriver getAppiumStackDriver(){
        URL appiumServerURL = null;
        try {
            appiumServerURL = new URL("http://hub.browserstack.com/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if (appiumStackDriver==null){
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("browserstack.user", "kitapyurdu_f7VsUH");
            desiredCapabilities.setCapability("browserstack.key", "MbQySGgMaGhpTXrUxitD");

            // Set URL of the application under test
            //desiredCapabilities.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");

            // Specify device and os_version for testing
            desiredCapabilities.setCapability("device", ConfigReader.getProperty("device"));
            desiredCapabilities.setCapability("os_version", ConfigReader.getProperty("os_version"));

            // Set other BrowserStack capabilities
            desiredCapabilities.setCapability("project", "KitapYurdu");
            desiredCapabilities.setCapability("build", "Kitapyurdu-MobilWeb-Automation");
            desiredCapabilities.setCapability("name", "Login");

            if (ConfigReader.getProperty("platformName").equals("android")) {
                //if you do not provide app path so you should provide "appPackage" and "appActivity"
//                desiredCapabilities.setCapability("appPackage","");
//                desiredCapabilities.setCapability("appActivity","");
                assert appiumServerURL != null;
                appiumStackDriver = new AndroidDriver(appiumServerURL,desiredCapabilities);
            } else if (ConfigReader.getProperty("platformName").equals("iOS")) {
                //if you do not provide app path so you should use "bundleId"
//                desiredCapabilities.setCapability("bundleId",ConfigReader.getProperty("iosBundleId"));
                assert appiumServerURL != null;
                appiumStackDriver = new IOSDriver(appiumServerURL,desiredCapabilities);
            } else {
                throw new UnsupportedOperationException("Invalid Platform Name " + ConfigReader.getProperty("platformName"));
            }
        }


        return appiumStackDriver;
    }
}
