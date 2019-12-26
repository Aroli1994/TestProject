Feature: Free CRM Login Feature

#WITHOUT EXAMPLES Keyword((use Scenario)
#Scenario: Free CRM Login Test Scenario
#
#Given user is already on login page
#When title of the login page
#Then user enters "vineeey" and "Vinay@1994"
#Then user clicks on login button
#Then user is on home page


#WITH EXAMPLES Keyword(use Scenario Outline: when example used)--
Scenario Outline: Free CRM Login Test Scenario

Given user is already on login page
When title of the login page
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then close the browser

Examples:
	| username | password |
	| vineeey  | Vinay@1994 | 
	| tom 	   | test542   |
	



#Scenario: user is able to create a new contact
#Given user is already on home page
#When user mouse hover on contacts link
#Then user clicks on new contacts link
#Then user enters firstname and lastname
#Then user clicks on save button
#Then verify new contact created
#Then close the browser

  
