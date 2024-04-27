Feature: Search Functionality

Scenario: Search for valid product
Given User opens the application
When User enter valid product into search field
And User click on search button
Then Valid product should get displayed in search results

Scenario: Search for non-existing product
Given User opens the application
When User enter non-existing product into search field
And User click on search button
Then Proper text informing user

