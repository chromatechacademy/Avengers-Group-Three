Feature: Testing expenses module
@Hayk @VNGRS-7
Scenario: Testing expenses module
Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
When user logs with valid username "general@teacher.com" and password "123456"
Then user is navigated to the dashboard page and sees text "Chroma Tech Academy"
#And user clicks Expenses
#Then following links are displayed "Add Expenses", "Search Expenses", "Expenses Head"