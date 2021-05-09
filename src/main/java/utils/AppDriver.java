package utils;

import config.PropertiesFile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppDriver {

    protected static AppiumDriver<MobileElement> driver;
    public static DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    public static String device, implicitWaitTime;
    static URL url;

    public static AppiumDriver<MobileElement> getDriver(){
        PropertiesFile.readPropertiesFile();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion ", "9.0");
        desiredCapabilities.setCapability("deviceName ", "Moto Z2 Play");
        desiredCapabilities.setCapability("udid", "ZY224676P8");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("appPackage", "com.google.android.calculator");
        desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        desiredCapabilities.setCapability("noReset","true");
        try {
            url = new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver = new AndroidDriver<>(url, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(Long.parseLong(implicitWaitTime), TimeUnit.SECONDS);
        return driver;
    }

}
