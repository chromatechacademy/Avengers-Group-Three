Feature: Income Module content 
We need to test the content of income module 
@Hayk @Progression @VNGRS-6
Scenario: Testing content in income module
Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
When user logs with valid username "general@teacher.com" and password "123456"
Then user is navigated to the dashboard page
And user clicks on "Income" module
Then User has to see folowing links "Add Income", "Search Income", "Income Head"