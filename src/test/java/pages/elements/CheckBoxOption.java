package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxOption {
    public WebDriver driver;

    public CheckBoxOption(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getNextArrow() {
        return driver.findElement(By.cssSelector(".rct-icon.rct-icon-expand-close"));
    }

    public WebElement getSelectedItemsResult() {
        return driver.findElement(By.id("result"));
    }

    public WebElement getHomeCheckBox() {
        return driver.findElement(By.cssSelector("#tree-node > ol > li > span > label > span.rct-checkbox > svg"));
    }

    public List<WebElement> getSelectedItemsList() {
        return driver.findElements(By.className("text-success"));
    }

    public String getSelectedItemsText() {
        String itemsFolder = "";
        for (WebElement folder : getSelectedItemsList()) {
            itemsFolder = itemsFolder + folder.getText() + " ";
        }
        return itemsFolder;
    }

    public void clickArrow() {
        getNextArrow().click();
    }

    public void clickHomeCheckBox() {
        getHomeCheckBox().click();
    }

    public List<WebElement> getItems() {
        return driver.findElements(By.className("rct-title"));
    }


}
