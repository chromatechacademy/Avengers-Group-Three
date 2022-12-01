Feature: Testing expenses module
We need to test the content of Expenses module
@Hayk @Regression @VNGRS-7
Scenario: Testing expenses module
Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
When user logs with valid username "general@teacher.com" and password "123456"
Then user is navigated to the dashboard page 
And user clicks on "Expenses" module
Then folowing links are displayed "Add Expense", "Search Expense", "Expense Head"

