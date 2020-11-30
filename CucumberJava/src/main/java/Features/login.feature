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
## (Comments)   Comment Multiple Lines using ctrl + /
#Sample Feature Definition Template


@tag
Feature: Free CRM Login Feature
  I want to use this template for my feature file


  @tag1
  
  
  Scenario: Free CRM Login Test Scenario
    Given user is already on Login Page
    When title of login page is Free CRM
    Then user enters username and password
    ## Then user enters "naveenk" and "test@123"  
    Then user clicks on login button
    Then user is on home page
    
    
   
    Given user clicks on Contacts link
    Then user clicks on New Contact button
    Then user enters firstname and lastname # Will pair with method of same name
    Then user clicks on Save button
    Then verify if contact added
    Then Close the browser
    
#1 Without Examples Keyword    Comment Multiple Lines using ctrl + /

  #Scenario: Free CRM Login Test Scenario   
    #Given user is already on Login Page
    #When title of login page is Free CRM
    #Then user enters "naveenk" and "test@123" # Will pair with method of Regular expression
    #Then user clicks on Login button
    #Then user is on home page
    #Then Close the browser
    
# 2 With Examples Keyword you have to use Scenario Outline instead of Scenario. Scenario Outline is used for Data driven approach when using example keyword

	Scenario Outline: Free CRM Login Test Scenario
	
		Given user is already on Login Page
		When title of login page is Free CRM
		Then user enters "<username>" and "<password>" # Will pair with method of Regular expression
		Then user clicks on login button
		Then user is on home page
		Then Close the browser


	Examples:
		| username | password |
		| naveenk  | test@123 |
		|  tom     | test456  | 	

  @tag3
  Scenario Outline: Title of your scenario outline # For using Examples keyword one has to use Scenario Outline instead of Scenario
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
