Feature: A CTSMS user can delete an admitted Student

@Daniela @Regression @VNGRS-12
Scenario:Delete student right after admission in order to reuse admission 
Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
When user logs with valid username "general@teacher.com" and password "123456"
Then user is navigated to the dashboard page
And clicks on the "Student Information" module
And clicks on "Bulk Delete" submodule 
And selects "SDET" from the Class dropdown and "Database Testing" from Section dropdown
And clicks Search
And checks the box on the row of student named "Marlene Fisher"
And clicks Delete button and confirms the allert
Then student "Marlene Fisher" is deleted