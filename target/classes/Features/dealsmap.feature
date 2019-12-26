Feature: Deal Data creation With Map

Scenario: Free CRM Create a new deal scenario 

	Given user is already on login page 

	When title of the login page 
	Then user enters username and password 
		| Username | Password |
		| vineeey | Vinay@1994 |
		
	Then user clicks on login button 
	Then user is on home page 
	Then user moves to new deal page 
	Then user enters deal details 
		| Title | Amount | Probability | Commission |
		| test deal1 | 1000 | 50 | 10 |
		| test deal2 | 2000 | 60 | 20 |
		| test deal3 | 3000 | 70 | 30 |
		
	Then close the browser