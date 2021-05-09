package uiElements.locators;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import uiElements.pages.BasePage;

public class GenericLocator extends BasePage {

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_1")
    public AndroidElement numberOne;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_2")
    public AndroidElement numberTwo;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_add")
    public AndroidElement plus;


}
