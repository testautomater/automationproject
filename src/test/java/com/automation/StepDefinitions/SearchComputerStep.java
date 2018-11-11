package com.automation.StepDefinitions;

import com.automation.Pages.PageBase;
import com.automation.Pages.ResultListPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchComputerStep {

    PageBase pgBase = new PageBase();
    ResultListPage resultListPage = new ResultListPage();

    @When("^User enters computer name \"([^\"]*)\" in search box$")
    public void userEntersComputerNameInSearchBox(String computerName) throws Throwable {
        pgBase.enterComputerToBeSearched(computerName);
    }


    @And("^User submit search button$")
    public void userSubmitSearchButton() throws Throwable {
        pgBase.submitSearchOption();
    }

    @Then("^User finds the Computer name \"([^\"]*)\" in result list$")
    public void userFindsTheComputerNameInResultList(String computerName) throws Throwable {
        resultListPage.verifyResultListFirstComputerName(computerName);
    }
}
