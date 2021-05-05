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

Feature: Title of your feature
 our six step of course workflow

  
  Scenario: our six step of course workflow
    Given User is in the homePage
    When User get the text Our Innovative Six Step Process
    Then user should get the first steps text
    And User should get littel explanation about first step
    And user should get the second steps text
    And User should get littel explanation about second step
    And user should get the thired steps text
    And User should get littel explanation about thired step
    And user should get the fourth steps text
    And User should get littel explanation about fourth step
    And user should get the fifth steps text
    And User should get littel explanation about fifth step
    And user should get the sixth steps text
    And User should get littel explanation about sixth step
   
 