package com.automation.Pages;

import com.automation.Util.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
    protected static WebDriver driver;

    public static final int timeoutInSeconds = 10;

    private static final String baseUrl = "http://computer-database.herokuapp.com/computers";

    @FindBy(how= How.LINK_TEXT, using="Add a new computer")
    private WebElement addComputerLink;

    @FindBy(how= How.CSS, using="[class='alert-message warning']")
    private WebElement alertMessage;

    @FindBy(how= How.ID, using="searchbox")
    private WebElement searchBoxSelector;

    @FindBy(how= How.ID, using="searchsubmit")
    private WebElement searchSubmitSelector;

    public PageBase(){
        driver = Driver.driver;
        driver.navigate().to(baseUrl);
        PageFactory.initElements(driver, this);
    }

    public void clickAddNewComputer(){
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(addComputerLink));
        addComputerLink.click();
    }

    public void successAlertMessageIsDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(alertMessage));
        Assert.assertTrue(alertMessage.isDisplayed());
    }

    public void enterComputerToBeSearched(String computerName){
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(searchBoxSelector));
        searchBoxSelector.sendKeys(computerName);
    }

    public void submitSearchOption(){
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(searchSubmitSelector));
        searchSubmitSelector.click();
    }
}
