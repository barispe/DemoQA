package test.elementsPage;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Locale;

public class CheckBoxTest extends BasePage {
    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        goToHomePage();
        homePage.goToElementsPage();
        elementsPage.clickCheckBoxOption();
    }

    @Test
    public void AllSubfoldersWillBeCheckedAfterCheckingHomeCheckBox() throws InterruptedException {
        checkBoxOption.clickHomeCheckBox();

        for (int i = 0; i < 6; i++) {
            checkBoxOption.clickArrow();
        }

        Assert.assertTrue(checkBoxOption.getSelectedItemsResult().isDisplayed());




        Thread.sleep(2000);
    }
}
