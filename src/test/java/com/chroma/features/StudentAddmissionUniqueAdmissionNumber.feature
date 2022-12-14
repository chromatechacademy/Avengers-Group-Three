Feature: Testing student admission unique admission number

   @Hayk @Regression @VNGRS-13
   Scenario Outline: Scenario Outline name: Student admission unique admission number
      Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
      When user logs with valid username "general@teacher.com" and password "123456"
      Then user is navigated to the dashboard page and sees text "Chroma Tech Academy"
      And clicks on the "Student Information" module
      And clicks on "Student Admission" submodule
      And enters "<admissionNO>" in Admission No text box and "<rollNo>" in Roll Number text box
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
      And navigates to If Guardian is and clicks on the radio button in front of "mother"
      And enters "eugenia_insigna@rotormail.com" in Guardian Email text box and "18 Eclipse St, Rotor 05" in the Guardian address text box
      And clicks Save
      Then student is admitted and "Record Saved Successfully" is displayed
      And enters "<admissionNO>" in Admission No text box and "<rollNo>" in Roll Number text box
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
      And navigates to If Guardian is and clicks on the radio button in front of "mother"
      And enters "eugenia_insigna@rotormail.com" in Guardian Email text box and "18 Eclipse St, Rotor 05" in the Guardian address text box
      And clicks Save
      Then "The Admission No field must contain a unique value." is displayed
      Then student record with admission No "<admissionNO>" in Class "SDET" in section "Database Testing" is deleted through "Bulk Delete" submodule
      Examples:
         | admissionNO | rollNo |
         | 933456      | 255    |




