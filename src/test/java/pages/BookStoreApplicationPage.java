package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookStoreApplicationPage {
    WebDriver driver;

    public BookStoreApplicationPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLoginButton(){
        return driver.findElement(By.id("login"));
    }

    public WebElement getSearchBox(){
        return driver.findElement(By.id("searchBox"));
    }

    public WebElement getSearchBoxButton(){
        return driver.findElement(By.id("basic-addon2"));
    }


}
