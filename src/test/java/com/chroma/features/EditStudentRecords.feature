Feature: A CTSMS user is able to edit student records by searching student detail

    @Nataliia @Regression @VNGRS-14
    Scenario: A CTSMS user creates and edit student records by searching student detail
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
        And enters December "15" in Admission Date
        And enters "08/23/2022" in As on Date
        And enters "37322020989" in "Mobile Number" and enters "1.75" in "Height" and enters "59" in "Weight"
        And enters father info as "Crile Fisher" in "Father Name" text box and "37360302051" in "Father Phone" text box and "Pediatrician" in "Father Occupation" text box
        And enters mother info as "Eugenia Insigna" in "Mother Name" text box and "37322235441" in "Mother Phone" text box and "Astronomer" in "Mother Occupation" text box
        And navigates to If Gaurdian is and clicks on the radio button in front of "mother"
        And enters "eugenia_insigna@rotormail.com" in Gaurdian Email text box and "18 Eclipse St, Rotor 05" in the Gaurdian address text box
        And clicks Save
        And user clicks on "Student Details", looks for a studend in a "SDET" class and "Database Testing" section, chooshes and clicks on edit button
        And user edits a record by adding Blood Group "A+"
        Then user is able to see Record Update Successfully information
        And user clicks on "Student Details", looks for a studend in a "SDET" class and "Database Testing" section, chooshes and clicks on student
        Then the changed information is displayed
        And user deletes "Marlene Fisher" records from "Bulk Delete" page, "SDET" class, "Database Testing" section
        

