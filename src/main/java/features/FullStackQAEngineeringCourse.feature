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
Feature: Full Stack QA Engineering Course details in the course link located in menu bar

  
  Scenario: User can get full details about QA engineering course in this page 
    Given User is in the home page
    When User find course link on menu bar
    And User keep the karsor on course link 
    Then User will see Full Stack QA Engineer in the list of the courses

  
  Scenario: User can get full details about QA engineering course in this page 
    Given User is in the home page
    When User find course link on menu bar
    And User keep the karsor on course link 
    And User click Full Stack QA Engineer in the list of the courses
    Then User will be in the Full Stack QA Engineer course
    
    