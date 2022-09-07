package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.*;
import pages.elements.CheckBoxOption;
import pages.elements.ElementsPage;
import pages.elements.TextBoxOption;

import java.io.IOException;
import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wdWait;
    public ExcelReader excelReader;
    public String homeURL;
    public HomePage homePage;
    public ElementsPage elementsPage;
    public FormsPage formsPage;
    public AlertsFrameWindowsPage alertsFrameWindowsPage;
    public WidgetsPage widgetsPage;
    public InteractionsPage interactionsPage;
    public BookStoreApplicationPage bookStoreApplicationPage;
    public TextBoxOption textBoxOption;
    public CheckBoxOption checkBoxOption;

    @BeforeClass
    public void setUP() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdWait = new WebDriverWait(driver, Duration.ofSeconds(15));
        excelReader = new ExcelReader("Text.xlsx");
        homeURL = excelReader.getCellData(0, 1, 1);
        homePage = new HomePage(driver);
        elementsPage = new ElementsPage(driver);
        formsPage = new FormsPage(driver);
        alertsFrameWindowsPage = new AlertsFrameWindowsPage(driver);
        widgetsPage = new WidgetsPage(driver);
        interactionsPage = new InteractionsPage(driver);
        bookStoreApplicationPage = new BookStoreApplicationPage(driver);
        textBoxOption = new TextBoxOption(driver);
        checkBoxOption = new CheckBoxOption(driver);
    }

    public void goToHomePage() {
        driver.navigate().to(homeURL);
    }

    public void waitVisibility(WebElement element){
        wdWait.until(ExpectedConditions.visibilityOf(element));
    }

    @AfterClass
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }

}
