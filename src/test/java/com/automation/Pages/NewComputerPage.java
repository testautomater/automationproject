package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NewComputerPage extends PageBase {

    @FindBy(how= How.ID, using="name")
    private WebElement inputComputerName;

    @FindBy(how= How.ID, using="introduced")
    private WebElement inputIntroducedDate;

    @FindBy(how= How.ID, using="discontinued")
    private WebElement inputDiscontinuedDate;

    @FindBy(how= How.ID, using="company")
    private WebElement selectCompany;

    @FindBy(how= How.CSS, using="[class='btn primary']")
    private WebElement createComputerButton;

    protected WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);

    public void inputComputerName(String computerName){
        wait.until(ExpectedConditions.visibilityOf(inputComputerName));
        inputComputerName.sendKeys(computerName);
    }

    public void setInputIntroducedDate(){
        Calendar cal = Calendar.getInstance();
        Date currentDate = cal.getTime();
        String modifiedDate= new SimpleDateFormat("yyyy-MM-dd").format(currentDate);
        inputIntroducedDate.sendKeys(modifiedDate);
    }

    public void setInputDiscontinuedDate(){
        Calendar cal = Calendar.getInstance();
        Date currentDate = cal.getTime();
        cal.add(Calendar.YEAR, 1);
        Date nextYearDate = cal.getTime();
        String modifiedDate= new SimpleDateFormat("yyyy-MM-dd").format(nextYearDate);
        inputDiscontinuedDate.sendKeys(modifiedDate);
    }

    public void selectComputerCompany(String companyName){
        Select select = new Select(selectCompany);
        select.selectByVisibleText(companyName);
    }

    public void submitCreateComputerButton(){
        createComputerButton.click();
    }

}
