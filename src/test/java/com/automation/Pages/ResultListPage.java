package com.automation.Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ResultListPage extends PageBase{

    @FindBy(how= How.CSS, using="[class='computers zebra-striped']")
    private WebElement resultListTable;

    @FindBy(how= How.CSS, using=".computers.zebra-striped>tbody>tr:nth-child(1)>td>a")
    private WebElement resultListFirstComputerName;

    protected WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);

    public void verifyResultListFirstComputerName(String computerName){
        wait.until(ExpectedConditions.visibilityOf(resultListFirstComputerName));
        Assert.assertTrue(resultListFirstComputerName.getText().contentEquals(computerName));
    }

    public void clickSearhedComputer(){
        wait.until(ExpectedConditions.visibilityOf(resultListFirstComputerName));
        resultListFirstComputerName.click();

    }
}
