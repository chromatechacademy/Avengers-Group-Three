Feature: A CTSMS user is able to add and delete sections
 @VNGRS-17  @Anastasiia @Regression
  Scenario: Student information module displayed on the portal 
  Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
  When user logs with valid username "general@teacher.com" and password "123456"
  Then user is navigated to the dashboard page and sees text "Chroma Tech Academy"
  When user clicks on "Academics" and "Sections"
  And user enters "Testing for everyone" in the Section name and click on Save 
  And  Record Saved Successfully and  Testing for everyone appeared in the Section List
  Then user clicks on delete and deleted Testing for everyone from the Section List


