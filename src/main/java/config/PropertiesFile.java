package config;

import utils.AppDriver;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {

    public static void readPropertiesFile(){
        Properties prop = new Properties();
        try {
            InputStream inputStream = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/config/config.properties");
            prop.load(inputStream);
            //BasePage.explicitWaitTime = prop.getProperty("explicitWait");
            AppDriver.device = prop.getProperty("device");
            AppDriver.implicitWaitTime = prop.getProperty("implicitWait");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
