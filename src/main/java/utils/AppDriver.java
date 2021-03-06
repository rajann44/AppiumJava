package utils;

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
    public static String device;
    static URL url;

    public static AppiumDriver<MobileElement> getDriver(){
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion" , "7.1.1");
        desiredCapabilities.setCapability("deviceName" , "Android Emulator");
        desiredCapabilities.setCapability("app" , System.getProperty("user.dir")+"/apk_file/ApiDemos-debug.apk");

        //desiredCapabilities.setCapability("deviceName ", "Android SDK built for x86");
        //desiredCapabilities.setCapability("udid", "emulator-5554");
        //desiredCapabilities.setCapability("deviceName" , "Android Emulator");
        //desiredCapabilities.setCapability("appPackage", "com.android.contacts");
        //desiredCapabilities.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
        //desiredCapabilities.setCapability("noReset","false");
        try {
            url = new URL("http://localhost:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver = new AndroidDriver<>(url, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }

}
