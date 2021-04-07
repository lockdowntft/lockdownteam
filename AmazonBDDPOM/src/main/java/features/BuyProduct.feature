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
Feature: step to complait buying a product 
  User can search desier product and complate buying 

  @tag1
  Scenario: step to complait buying a product 
  
   Given User should be in the Amazon Homepage
    When  User search desire product 
   Then User will see their desier product
   When User click to the diser product.
   Then User will see phone color option
   And User will see Memory Size optin
   And User will see initial cost and monthly cost
   When user pic the color memory size and cost
   And User click to buy now button
   Then User will see buying methode 
   When User click Add Personal Checking Accounts
   Then user will see Name on Account box and Bank Routing Number box     
   And User will see Id number box  and select state box
   When User click add this Checking Accounts
   Then User will see continue button of review order before it is final
   When User click to the continue button
   Then User will see a buying confurmation number 
   
   