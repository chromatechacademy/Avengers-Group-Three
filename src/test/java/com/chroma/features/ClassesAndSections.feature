Feature: Classes and Sections

@Progression
Scenario: Ability to add and delete classes
Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
When user logs with valid username "general@teacher.com" and password "123456"
And navigates to "Academics" module
And navigates to "Class" submodule
