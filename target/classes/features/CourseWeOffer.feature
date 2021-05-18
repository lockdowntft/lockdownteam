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

Feature: 
 courses link functionality inthe homePage

  Scenario: Data Analytics & Visualization course link functionality test
  
    Given User is in the Home Page
    When User click to Data Analytics link 
    Then User should lands Data Analytics & Visualization page
    
    Scenario: Full Stack QA Engineering course link functionality test
    
    Given User is in the Home Page
    When User click to Full Stack QA Engineering link
    Then User should lands Full Stack QA Engineering page
    
    Scenario: Business Analyst course link functionality test
    
    Given User is in the Home Page
    When User click to Business Analyst link
    Then User should land Business Analyst page
    
    Scenario: Cyber Security Professional course link functionality test
    
    Given User is in the Home Page
    When User click to Cyber Security Professional link
    Then User should lands Cyber Security Professional page
    
    Scenario: Explore all Courses link functionality test
    
    Given User is in the Home Page
    When User click to Explore all Courses link 
    Then User should land Explore all Courses page
    
    Scenario: Cloud Engineering Courses link functionality test
    
    Given User is in the Home Page
    When User click to Explore all Courses link 
    And User click to the Cloud Engineering Courses link
    Then Uaser should land Cloud Engineering Courses page
   