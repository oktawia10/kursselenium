Feature: attravin register user

Scenario: user can register in avtrain

Given a browser with open https://aavtrain.com/index.asp
When user cliks "First Time Stud" button
  Then registration form opens
When user input First Name, Last Name, Email Address, Username, Address 1, Number, City, State, Zip, Password
	 	And user click submit button
  Then error " "

