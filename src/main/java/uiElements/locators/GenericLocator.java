package uiElements.locators;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import uiElements.pages.BasePage;

public class GenericLocator extends BasePage {

    @AndroidFindBy(accessibility = "Accessibility")
    public AndroidElement accessibility;

    @AndroidFindBy(accessibility = "Accessibility Node Querying")
    public AndroidElement accessibilityNode;

}
