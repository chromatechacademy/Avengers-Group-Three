Feature: Automating login page

@Valeriia @Regression @VNGRS-1
Scenario: Testing login page
Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
When user logs with valid username "general@teacher.com" and password "123456"
Then user is navigated to the dashboard page 

@Progression @Mari @VNGRS-2
Scenario: Invalid Credentials login
Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
When user logs with valid username "general@teacher.co" and password "12346"
Then message "Invalid Username or Password" displays
