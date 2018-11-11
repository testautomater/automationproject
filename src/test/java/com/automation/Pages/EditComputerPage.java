package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditComputerPage extends PageBase {
    @FindBy(how= How.ID, using="name")
    private WebElement editComputerName;

    @FindBy(how= How.CSS, using="[class='btn primary']")
    private WebElement saveButton;

    @FindBy(how= How.CSS, using="[class='btn danger']")
    private WebElement deleteComputerButton;

    protected WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);

    public void editComputerName(String computerName){
        wait.until(ExpectedConditions.visibilityOf(editComputerName));
        editComputerName.sendKeys(computerName);
    }

    public void clickSaveComputerButton(){
        wait.until(ExpectedConditions.visibilityOf(saveButton));
        saveButton.click();
    }

    public void clickDeleteComputerButton(){
        wait.until(ExpectedConditions.visibilityOf(deleteComputerButton));
        deleteComputerButton.click();
    }

}
