package testScripts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import uiElements.pages.GenericPage;
import utils.TestListeners;

@Listeners(TestListeners.class)
public class verifyPage {

    GenericPage genericPage = new GenericPage();

    @Test(priority = 2, groups = "unit")
    public void openCalculator(){
        Assert.assertTrue(genericPage.numberOne.isDisplayed());
    }

    @Test(priority = 1)
    public void openCalculator2(){
        Assert.assertTrue(genericPage.numberOne.isDisplayed());
    }

}
