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
Feature: LogIn Functunality 
  User should LogedIn with valid credantial 

  @tag1
  Scenario: LogIn with valied credantial
    Given User Shuild be in the Home Page
    When User able to click to the Account link
    And User click to the signin link
    Then User will be in the signin page
    When User put Valied Email and Password
    And User click to the SignIn button 
    Then User should SuccessFully log in to the account 
    
    Scenario: LogIn Fail with Invalied credantial
    
    Given User Shuild be in the Home Page
    When User able to click to the Account link
    And User click to the signin link
    Then User will be in the signin page
    When User put invalied Email and Password
    And User click to the SignIn button 
    Then User should not SuccessFully log in to the account 
    
    