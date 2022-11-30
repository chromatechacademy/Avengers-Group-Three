Feature: Automating login page
@Progression @Valeriia @VNGRS-1
Scenario: Testing login page
Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
When user logs with valid username "general@teacher.com" and password "123456"
Then user is navigated to the dashboard page 
