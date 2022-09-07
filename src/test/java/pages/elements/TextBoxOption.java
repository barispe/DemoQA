package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TextBoxOption {
    public WebDriver driver;

    public TextBoxOption(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getFullNameField(){
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmailField(){
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getEmailErrorOutline(){
        return driver.findElement(By.cssSelector(".mr-sm-2.field-error.form-control"));
    }

    public WebElement getCurrentAddressField(){
        return driver.findElement(By.cssSelector("#currentAddress"));
    }

    public WebElement getPermamentAddressField(){
        return driver.findElement(By.cssSelector("#permanentAddress"));
    }

    public WebElement getSubmitButton(){
        return driver.findElement(By.id("submit"));
    }

    public String getSubmittedNameText(){
        String name = driver.findElement(By.id("name")).getText();
        return name.substring(5);
    }


    public String getSubmittedEmailText(){
        String email = driver.findElement(By.id("email")).getText();
        return email.substring(6);
    }

    public String getCurrentAddress(){
        List<WebElement> currentAddress = driver.findElements(By.id("currentAddress"));
        String currAddres = currentAddress.get(1).getText();
       return currAddres.substring(17);
    }

    public String getPermanenetAddress(){
        List<WebElement> permaAddress = driver.findElements(By.id("permanentAddress"));
        String permanentAddress = permaAddress.get(1).getText();
        return permanentAddress.substring(20);
    }

    public void inputFullName(String name){
        getFullNameField().sendKeys(name);
    }

    public void inputEmail(String email){
        getEmailField().sendKeys(email);
    }

    public void inputCurrentAddress(String currentAddress){
        getCurrentAddressField().sendKeys(currentAddress);
    }

    public void inputPermanentAddress(String permaAddress){
        getPermamentAddressField().sendKeys(permaAddress);
    }

    public WebElement getSubmitResponse(){
        return driver.findElement(By.cssSelector(".border.col-md-12.col-sm-12"));
    }

    public void clickSubmitButton(){
        getSubmitButton().click();
    }

}
