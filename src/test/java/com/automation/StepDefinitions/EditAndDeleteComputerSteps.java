package com.automation.StepDefinitions;

import com.automation.Pages.EditComputerPage;
import com.automation.Pages.ResultListPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class EditAndDeleteComputerSteps {
    ResultListPage resultListPage = new ResultListPage();
    EditComputerPage editComputerPage = new EditComputerPage();

    @And("^User click on searched computer$")
    public void userClickOnSearchedComputer() throws Throwable {
        resultListPage.clickSearhedComputer();
    }

    @When("^User edits the computer name to \"([^\"]*)\"$")
    public void userEditsTheComputerNameTo(String computerName) throws Throwable {
        editComputerPage.editComputerName(computerName);
    }

    @And("^User Click on Save this Computer button$")
    public void userClickOnSaveThisComputerButton() throws Throwable {
        editComputerPage.clickSaveComputerButton();
    }

    @When("^User clicks on Delete This computer$")
    public void userClicksOnDeleteThisComputer() throws Throwable {
        editComputerPage.clickDeleteComputerButton();
    }
}
