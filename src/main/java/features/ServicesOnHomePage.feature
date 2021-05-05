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
  Services we provied to the student

 
  Scenario: Description about IT Training courses and Learn More link fuctionality test
    Given User is in the Home page
    When User get the IT Training headline 
    And User find littel explanation about IT Training courses
   
    And User click to the Learn More link
    Then User will be IT Training courses page
   
    Scenario: Description about Job Placement services and Learn More link fuctionality test
    Given User is in the Home page
    When User get the Job Placement headline 
    And User find littel explanation about Job Placement
   
    And User click to the Learn More link
    Then User will be Job Placement services page
    
   Scenario: Description about IT Staffing services and Learn More link fuctionality test
    Given User is in the Home page
    When User get the IT Staffing headline 
    And User find littel explanation about IT Staffing
    
    And User click to the Learn More link
    Then User will be IT Staffing services page
    
    Scenario: Description about IT Consultancy services and Learn More link fuctionality test
    Given User is in the Home page
    When User get the IT Consultancy headline 
    And User find littel explanation about IT Consultancy services
   
    And User click to the Learn More link
    Then User will be IT Consultancy services page
    
    
    
    
    