Feature: A CTSMS user is able click and see student information module

 @Anastasiia @VNGRS-4 @Progression
  Scenario: Student information module displayed on the portal 
  Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
  When user logs with valid username "general@teacher.com" and password "123456"
  Then user is navigated to the dashboard page and sees text "Chroma Tech Academy" 
  When user clicks on "Student Information"
  Then user is able to see links displayed "Student Details", "Student Admission", "Disabled Students", "Bulk Delete", "Student Categories", "Student House", "Disable Reason"
