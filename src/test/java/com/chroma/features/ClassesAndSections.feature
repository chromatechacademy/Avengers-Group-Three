Feature: Classes and Sections

@Mari @VNGRS-18
Scenario: Ability to add and delete classes
Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
When user logs with valid username "general@teacher.com" and password "123456"
And navigates to "Academics" module
And navigates to "Class" submodule
And enters "Mari Class" in class text box
And checks "Sample" box 
And clicks save 
And "Record Saved Successfully" displays
Then deletes class
