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
Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a new contact scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page

Given user clicks on Contacts link
Then user clicks on New Contact button
Then user enters new contact details "<firstname>" and "<lastname>" and "<position>"
Then user clicks on Save button
Then verify if "<contactname>" added
Then Close the browser

Examples:
	| username             | password   | firstname | lastname | position | contactname |
	| piano4060@gmail.com  | Test@12345 | Tom 	    | maca     | Manager  | Tom maca    |
	| piano4060@gmail.com  | Test@12345 | David 	  | Dsouza   | Director | David Dsouza|