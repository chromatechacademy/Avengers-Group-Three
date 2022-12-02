Feature: A CTSMS user is able to see submodules of the Academics module

 @Daniela @VNGRS-8
  Scenario: Student information module displayed on the portal
  Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
  When user logs with valid username "general@teacher.com" and password "123456"
  Then user is navigated to the dashboard page and sees text "Chroma Tech Academy"
  When user clicks on "Academics" module
  Then user is able to see submodules displayed "Class Timetable", "Teachers Timetable", "Assign Class Teacher", "Promote Students", "Subject Group", "Subjects", "Class", "Sections"