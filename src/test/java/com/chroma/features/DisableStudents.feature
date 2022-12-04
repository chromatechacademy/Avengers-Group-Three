Feature: CTSMS Ability to disable and enable students

  @Regression @Valeriia @VNGRS-15 @VNGRS-16
  Scenario: Ability to disable and enable students
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
    When user logs with valid username "general@teacher.com" and password "123456"
    Then user is navigated to the dashboard page and sees text "Chroma Tech Academy"
    And clicks on the "Student Information" module
    And clicks on "Student Admission" submodule
    And enters "20989" in Admission No text box and "254" in Roll Number text box
    And enters "Marlene" in the First Name text box and "Fisher" in the Last Name text box
    And selects "SDET" from the Class dropdown and "Database Testing" from Section dropdown
    And selects "Female" from the Gender dropdown
    And selects "Selenium" from the Category dropdown
    And enters "Marlene_Fisher@rotormail.com" in the Email text box
    And and selects "AB+" from the Blood Group dropdown
    And enters "04/29/2005" in Date of Birth
    And enters "12/15/2022" in Admission Date
    And enters "08/23/2022" in As on Date
    And enters "37322020989" in "Mobile Number" and enters "1.75" in "Height" and enters "59" in "Weight"
    And enters father info as "Crile Fisher" in "Father Name" text box and "37360302051" in "Father Phone" text box and "Pediatrician" in "Father Occupation" text box
    And enters mother info as "Eugenia Insigna" in "Mother Name" text box and "37322235441" in "Mother Phone" text box and "Astronomer" in "Mother Occupation" text box
    And navigates to If Gaurdian is and clicks on the radio button in front of "mother"
    And enters "eugenia_insigna@rotormail.com" in Gaurdian Email text box and "18 Eclipse St, Rotor 05" in the Gaurdian address text box
    And clicks Save
    Then student is admitted and "Record Saved Successfully" is displayed
    And clicks on "Student Details" submodule
    And selects "SDET" from the Class dropdown and "Database Testing" from Section dropdown
    And clicks on a search button
    And clicks on a record "20989" and selects the student "Marlene Fisher"
    And disables student for a reason "Very Loud" and accepts alert
    And enables student and accepts alert
    Then student record with name "Marlene Fisher" in Class "SDET" in section "Database Testing" is deleted through "Bulk Delete" submodule
