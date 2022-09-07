package test.elementsPage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxOptionTest extends BasePage {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        goToHomePage();
        homePage.goToElementsPage();
        elementsPage.clickTextBoxOption();
    }

    @Test
    public void UserCanSumbitWithAllFieldsFilled() {
        WebElement fullNameField = textBoxOption.getFullNameField();
        WebElement emailField = textBoxOption.getEmailField();
        WebElement currAddressField = textBoxOption.getCurrentAddressField();
        WebElement permaAddressField = textBoxOption.getPermamentAddressField();

        String fullName = excelReader.getCellData(1,1,0);
        String email = excelReader.getCellData(1,1,1);
        String currentAddress = excelReader.getCellData(1,1,2);
        String permanentAddress = excelReader.getCellData(1,1,3);

        textBoxOption.inputFullName(fullName);
        textBoxOption.inputEmail(email);
        textBoxOption.inputCurrentAddress(currentAddress);
        textBoxOption.inputPermanentAddress(permanentAddress);
        textBoxOption.clickSubmitButton();

        waitVisibility(textBoxOption.getSubmitResponse());

        String submitName = textBoxOption.getSubmittedNameText();
        String submitEmail = textBoxOption.getSubmittedEmailText();
        String submitCurrAddress = textBoxOption.getCurrentAddress();
        String submitPermaAddress = textBoxOption.getPermanenetAddress();

        Assert.assertEquals(submitName, fullName);
        Assert.assertEquals(submitEmail, email);
        Assert.assertEquals(submitCurrAddress, currentAddress);
        Assert.assertEquals(submitPermaAddress, permanentAddress);
        Assert.assertNotNull(fullNameField);
        Assert.assertNotNull(emailField);
        Assert.assertNotNull(currAddressField);
        Assert.assertNotNull(permaAddressField);

    }
    @Test
    public void UserCanSubmitWithOnlyFullNameFilled() {
        WebElement fullNameField = textBoxOption.getFullNameField();
        String emailField = textBoxOption.getEmailField().getText();
        String currAddressField = textBoxOption.getCurrentAddressField().getText();
        String permaAddressField = textBoxOption.getPermamentAddressField().getText();

        String fullName = excelReader.getCellData(1,1,0);

        textBoxOption.inputFullName(fullName);
        textBoxOption.clickSubmitButton();

        waitVisibility(textBoxOption.getSubmitResponse());

        String submitName = textBoxOption.getSubmittedNameText();

        Assert.assertEquals(submitName, fullName);
        Assert.assertNotNull(fullNameField);
        Assert.assertEquals(emailField, "");
        Assert.assertEquals(currAddressField,"");
        Assert.assertEquals(permaAddressField,"");
    }

    @Test
    public void UserCannotSubmitInvalidEmailAddress(){
        String fullName = excelReader.getCellData(1,1,0);
        String invalidEmail = excelReader.getCellData(1,1,4);
        String currentAddress = excelReader.getCellData(1,1,2);
        String permanentAddress = excelReader.getCellData(1,1,3);

        textBoxOption.inputFullName(fullName);
        textBoxOption.inputEmail(invalidEmail);
        textBoxOption.inputCurrentAddress(currentAddress);
        textBoxOption.inputPermanentAddress(permanentAddress);
        textBoxOption.clickSubmitButton();

        WebElement redErrorOutline = textBoxOption.getEmailErrorOutline();

        waitVisibility(redErrorOutline);

        Assert.assertTrue(redErrorOutline.isDisplayed());
    }


}
