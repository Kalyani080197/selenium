Feature: User Login
Scenario: Login with valid creditials
Given user navigates to login page
When user enters email address "kalyani080197@gmail.com"
And enters valid password "12345"
And clicks on login button
Then user should successfully login 


Scenario: Login with invalid creditials
Given user navigates to login page
When user enters email address "kalyani080197@gmail.com"
And enters valid password "12345678"
And clicks on login button
Then user should get proper warning message