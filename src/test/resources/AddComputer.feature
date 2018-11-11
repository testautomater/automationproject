@e2e @add
Feature: Checking feature of adding computer

  @addNewComputer
  Scenario: As a user I want to add a new computer
    Given User click on Add a new computer button
    When User enters computer name "APTECH"
    And User enters Introduced date
    And User enters discontinued date
    And User selects a company name "Thinking Machines"
    And User submit the form
    Then Users is notified with success alert message