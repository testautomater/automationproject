package com.automation.StepDefinitions;

import com.automation.Pages.NewComputerPage;
import com.automation.Pages.PageBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddComputerSteps {

    PageBase pgBase = new PageBase();
    NewComputerPage newComputerPage = new NewComputerPage();

    @Given("^User click on Add a new computer button$")
    public void userClickOnAddANewComputerButton() throws Throwable {
        pgBase.clickAddNewComputer();
    }

    @When("^User enters computer name \"([^\"]*)\"$")
    public void userEntersComputerName(String computerName) throws Throwable {
        newComputerPage.inputComputerName(computerName);
    }

    @And("^User enters Introduced date$")
    public void userEntersIntroducedDate() throws Throwable {
        newComputerPage.setInputIntroducedDate();
    }

    @And("^User enters discontinued date$")
    public void userEntersDiscontinuedDate() throws Throwable {
        newComputerPage.setInputDiscontinuedDate();
    }

    @And("^User selects a company name \"([^\"]*)\"$")
    public void userSelectsACompanyName(String companyName) throws Throwable {
        newComputerPage.selectComputerCompany(companyName);
    }

    @And("^User submit the form$")
    public void userSubmitTheForm() throws Throwable {
       newComputerPage.submitCreateComputerButton();
    }

    @Then("^Users is notified with success alert message$")
    public void usersIsNotifiedWithSuccessAlertMessage() throws Throwable {
        pgBase.successAlertMessageIsDisplayed();
    }
}
