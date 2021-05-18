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
Feature: Appointment booking functionality from the homepage of application
 
 Scenario: User can book an appoinment by using this link
  
Given User is in the home page
When User click to Book an Appointment link
Then User will land to Book an Appointment page

Scenario: User can put information to the empty box to get appoinment
  
Given User is in the home page
When User click to Book an Appointment link
And  User will find empty box to put information
And User can put name on Your Nmae box
And User Can put phone number on Phone Number box
And User can put email on Email box 
And User can put appoinment subject on Appoinment subject box
And User can select the date, want appoinment
And User can Write a massage on massage box
And User can click to send masage
Then User will see massage has been sent



  
