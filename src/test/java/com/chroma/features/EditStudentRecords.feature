Feature: A CTSMS user is able to edit student records by searching student detail

    @Nataliia @Progression @VNGRS-14
    Scenario: A CTSMS user creates and edit student records by searching student detail
        Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
        When user logs with valid username "general@teacher.com" and password "123456"
        And clicks on "Student Admission" under "Student Information" and creates new student
        And user looks for a studend, edits a record
        Then user is able to see links displayed "Record Update Successfuly"
        And user looks for a studend, clicks on a record
        Then the changed information is displayed
       
