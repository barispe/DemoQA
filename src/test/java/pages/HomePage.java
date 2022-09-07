package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getAllCards() {
        return driver.findElements(By.className("card-body"));
    }

    public WebElement getPageHeader() {
        return driver.findElement(By.className("main-header"));
    }

    public String getCardMiddleBoxText() {
        return driver.findElement(By.cssSelector(".col-12.mt-4.col-md-6")).getText();
    }

    public void goToElementsPage() {
        int list = getAllCards().size();
        for (int i = 0; i < list; i++) {
            if (getAllCards().get(i).getText().equals("Elements")) {
                getAllCards().get(i).click();
                break;
            }
        }
    }

    public void goToFormsPage() {
        int list = getAllCards().size();
        for (int i = 0; i < list; i++) {
            if (getAllCards().get(i).getText().equals("Forms")) {
                getAllCards().get(i).click();
                break;

            }
        }
    }

    public void goToAlertsFrameWindowPage() {
        int list = getAllCards().size();
        for (int i = 0; i < list; i++) {
            if (getAllCards().get(i).getText().equals("Alerts, Frame & Windows")) {
                getAllCards().get(i).click();
                break;
            }
        }
    }

    public void goToWidgetsPage() {
        int list = getAllCards().size();
        for (int i = 0; i < list; i++) {
            if (getAllCards().get(i).getText().equals("Widgets")) {
                getAllCards().get(i).click();
                break;
            }
        }
    }

    public void goToInteractionsPage() {
        int list = getAllCards().size();
        for (int i = 0; i < list; i++) {
            if (getAllCards().get(i).getText().equals("Interactions")) {
                getAllCards().get(i).click();
                break;
            }
        }
    }

    public void goToBookStoreApplication() {
        int list = getAllCards().size();
        for (int i = 0; i < list; i++) {
            if (getAllCards().get(i).getText().equals("Book Store Application")) {
                getAllCards().get(i).click();
                break;
            }
        }
    }
}
