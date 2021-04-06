#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Home Page Link Functionality
  User able to click to the link of Home Page

  @tag1
  Scenario: Home Page Link Functionality
  
    Given User is in the Home Page
    When User click to the Account link
    And User should click to the signin link
    Then User should be in the signin page
    When User click to the Pickup & delivery link
    Then User will be in the Pickup & delivery page
    When User click to the menu bar link
    Then User should be in the menu bar page
    When User search product on the search box 
    And User User click to submeet button to find product
    Then User should see the desier product 
    When User click to hte My Items link
    Then User will be in the My Items page
    When User click to the cart link 
    Then User should be in the cart page
    
    
    
    
    
    