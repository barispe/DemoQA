package test;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BasePage {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        goToHomePage();
    }

    @Test
    public void UserCanGoToElementsPage() {
        homePage.goToElementsPage();
        WebElement headerElement = homePage.getPageHeader();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = excelReader.getCellData(0, 2, 1);

        String actualMiddleBoxText = homePage.getCardMiddleBoxText();
        String expectedText = "Please select an item from left to start practice.";

        String actualElementsHeaderText = headerElement.getText();
        String expectedElementsHeaderText = "Elements";

        Assert.assertEquals(actualURL, expectedURL);
        Assert.assertEquals(actualElementsHeaderText, expectedElementsHeaderText);
        Assert.assertTrue(headerElement.isDisplayed());
        Assert.assertEquals(actualMiddleBoxText, expectedText);

    }

    @Test
    public void UserCanGoToFormsPage() {
        homePage.goToFormsPage();
        WebElement headerElement = homePage.getPageHeader();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = excelReader.getCellData(0, 3, 1);

        String actualMiddleBoxText = homePage.getCardMiddleBoxText();
        String expectedText = "Please select an item from left to start practice.";

        String actualElementsHeaderText = headerElement.getText();
        String expectedElementsHeaderText = "Forms";

        Assert.assertEquals(actualURL, expectedURL);
        Assert.assertEquals(actualElementsHeaderText, expectedElementsHeaderText);
        Assert.assertTrue(headerElement.isDisplayed());
        Assert.assertEquals(actualMiddleBoxText, expectedText);
    }

    @Test
    public void UserCanGoToEAlertsFrameWindowsPage() {
        homePage.goToAlertsFrameWindowPage();
        WebElement headerElement = homePage.getPageHeader();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = excelReader.getCellData(0, 4, 1);

        String actualMiddleBoxText = homePage.getCardMiddleBoxText();
        String expectedText = "Please select an item from left to start practice.";

        String actualElementsHeaderText = headerElement.getText();
        String expectedElementsHeaderText = "Alerts, Frame & Windows";

        Assert.assertEquals(actualURL, expectedURL);
        Assert.assertEquals(actualElementsHeaderText, expectedElementsHeaderText);
        Assert.assertTrue(headerElement.isDisplayed());
        Assert.assertEquals(actualMiddleBoxText, expectedText);
    }

    @Test
    public void UserCanGoToWidgetsPage() {
        homePage.goToWidgetsPage();
        WebElement headerElement = homePage.getPageHeader();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = excelReader.getCellData(0, 5, 1);

        String actualMiddleBoxText = homePage.getCardMiddleBoxText();
        String expectedText = "Please select an item from left to start practice.";

        String actualElementsHeaderText = headerElement.getText();
        String expectedElementsHeaderText = "Widgets";

        Assert.assertEquals(actualURL, expectedURL);
        Assert.assertEquals(actualElementsHeaderText, expectedElementsHeaderText);
        Assert.assertTrue(headerElement.isDisplayed());
        Assert.assertEquals(actualMiddleBoxText, expectedText);
    }

    @Test
    public void UserCanGoToInteractionsPage() {
        homePage.goToInteractionsPage();
        WebElement headerElement = homePage.getPageHeader();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = excelReader.getCellData(0, 6, 1);

        String actualMiddleBoxText = homePage.getCardMiddleBoxText();
        String expectedText = "Please select an item from left to start practice.";

        String actualElementsHeaderText = headerElement.getText();
        String expectedElementsHeaderText = "Interactions";

        Assert.assertEquals(actualURL, expectedURL);
        Assert.assertEquals(actualElementsHeaderText, expectedElementsHeaderText);
        Assert.assertTrue(headerElement.isDisplayed());
        Assert.assertEquals(actualMiddleBoxText, expectedText);
    }

    @Test
    public void UserCanGoToBookStoreApplicationPage() {
        homePage.goToBookStoreApplication();
        WebElement headerElement = homePage.getPageHeader();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = excelReader.getCellData(0, 7, 1);

        waitVisibility(bookStoreApplicationPage.getLoginButton());

        WebElement loginButton = bookStoreApplicationPage.getLoginButton();
        WebElement searchBox = bookStoreApplicationPage.getSearchBox();
        WebElement searchBoxButton = bookStoreApplicationPage.getSearchBoxButton();

        String actualElementsHeaderText = headerElement.getText();
        String expectedElementsHeaderText = "Book Store";

        Assert.assertEquals(actualURL, expectedURL);
        Assert.assertEquals(actualElementsHeaderText, expectedElementsHeaderText);
        Assert.assertTrue(headerElement.isDisplayed());
        Assert.assertTrue(loginButton.isDisplayed());
        Assert.assertTrue(searchBox.isDisplayed());
        Assert.assertTrue(searchBoxButton.isDisplayed());
    }


}
