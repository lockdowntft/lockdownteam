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

Feature: Contact us functionality from header menu bar

  
  Scenario: User can see the carrer oppertunati on transfotech academy
    Given User is in the home page
    When User keep the karsor on contectUs link
    Then User will see carrer link

  
  Scenario: User can see the carrer oppertunati on transfotech academy
   Given User is in the home page
    When User keep the karsor on contectUs link
    And User click to carrer link 
    And User will land to carrer page 
    And User will find the list of jobs 

   