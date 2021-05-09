package uiElements.pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import uiElements.locators.GenericLocator;

public class GenericPage extends GenericLocator {

    public GenericPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

}
