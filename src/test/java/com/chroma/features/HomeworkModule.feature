Feature: Testing homework module
We need to test the content of Homework module
@Hayk @Progression @VNGRS-10
Scenario: Testing homework module
Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
When user logs with valid username "general@teacher.com" and password "123456"
Then user is navigated to the dashboard page 
And user clicks on "Homework" module
Then folowing link is displayed "Add Homework"