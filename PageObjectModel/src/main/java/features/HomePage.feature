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
  
   Given User is in the Amazon Homepage
   When User click to Account Link
   Then User will be in the Login page
   When User click to the All menu link 
   Then User should see All the menu
   When  User able to search desire product 
   Then User should see their desier product
   When USer click to the ruturn link
   Then User should be in the return page
   When User click to curt link
   Then User should be curt page
   
   
   
 