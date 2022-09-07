package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage {
    WebDriver driver;

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickTextBoxOption() {
        driver.findElement(By.cssSelector("#item-0")).click();
    }

    public void clickCheckBoxOption() {
        driver.findElement(By.cssSelector("#item-1")).click();
    }

    public void clickRadioBoxOption() {
        driver.findElement(By.cssSelector("#item-2")).click();
    }

    public void clickWebTablesOption() {
        driver.findElement(By.cssSelector("#item-3")).click();
    }

    public void clickButtonsOption() {
        driver.findElement(By.cssSelector("#item-4")).click();
    }

    public void clickCLinksOption() {
        driver.findElement(By.cssSelector("#item-5")).click();
    }

    public void clickBrokenLinksImagesOption() {
        driver.findElement(By.cssSelector("#item-6")).click();
    }

    public void clickUploadAndDownloadOption() {
        driver.findElement(By.cssSelector("#item-7")).click();
    }

    public void clickDynamicPropertiesOption() {
        driver.findElement(By.cssSelector("#item-8")).click();
    }


}
