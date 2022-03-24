package testScripts;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import uiElements.pages.GenericPage;
import utils.TestListeners;

@Listeners(TestListeners.class)
public class verifyPage {

    GenericPage genericPage = new GenericPage();

    @Test(priority = 2, groups = "unit")
    public void clickAccess(){
        genericPage.accessibility.click();
        genericPage.accessibilityNode.click();
    }

    @Test(priority = 1, groups = "smoke")
    public void openAccess(){
        Assert.assertTrue(genericPage.accessibility.isDisplayed());
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown()
    {
        genericPage.closeApp();
    }

}
