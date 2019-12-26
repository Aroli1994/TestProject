Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a new contact scenario

Given user is already on login page
When title of the login page
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user moves to new contact page	 
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then close the browser

Examples:
	| username | password   | firstname | lastname | position  |
	| vineeey  | Vinay@1994 | Vinay     | Krishna  | Associate |
	| vineeey  | Vinay@1994	| Tom	    | Hanks	   | Manager   |