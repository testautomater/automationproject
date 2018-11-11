@e2e @search
Feature: Checking feature of Searching computer

  @searchComputer
  Scenario: As a user I want to search for a computer
    Given User click on Add a new computer button
    And User enters computer name "APTECH"
    And User enters Introduced date
    And User enters discontinued date
    And User selects a company name "Thinking Machines"
    And User submit the form
    And Users is notified with success alert message
    When User enters computer name "APTECH" in search box
    And User submit search button
    Then User finds the Computer name "APTECH" in result list
