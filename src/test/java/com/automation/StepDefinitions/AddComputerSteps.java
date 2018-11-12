package com.automation.StepDefinitions;

import com.automation.Pages.AddComputerPage;
import com.automation.Pages.PageBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddComputerSteps {

    PageBase pgBase = new PageBase();
    AddComputerPage addComputerPage = new AddComputerPage();

    @Given("^User click on Add a new computer button$")
    public void userClickOnAddANewComputerButton() throws Throwable {
        pgBase.clickAddNewComputer();
    }

    @When("^User enters computer name \"([^\"]*)\"$")
    public void userEntersComputerName(String computerName) throws Throwable {
        addComputerPage.inputComputerName(computerName);
    }

    @And("^User enters Introduced date$")
    public void userEntersIntroducedDate() throws Throwable {
        addComputerPage.setInputIntroducedDate();
    }

    @And("^User enters discontinued date$")
    public void userEntersDiscontinuedDate() throws Throwable {
        addComputerPage.setInputDiscontinuedDate();
    }

    @And("^User selects a company name \"([^\"]*)\"$")
    public void userSelectsACompanyName(String companyName) throws Throwable {
        addComputerPage.selectComputerCompany(companyName);
    }

    @And("^User submit the form$")
    public void userSubmitTheForm() throws Throwable {
       addComputerPage.submitCreateComputerButton();
    }

    @Then("^Users is notified with success alert message$")
    public void usersIsNotifiedWithSuccessAlertMessage() throws Throwable {
        pgBase.successAlertMessageIsDisplayed();
    }

    @Then("^User is notified for required Computer name field$")
    public void userIsNotifiedForRequiredComputerNameField() throws Throwable {
        addComputerPage.reuiredFieldHelplineIsDisplayed();
    }
}
