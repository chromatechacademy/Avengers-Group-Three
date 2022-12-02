Feature: A CTSMS user is able to edit student records by searching student detail

   @Nataliia @ @VNGRS-14
    Scenario: A CTSMS user creates and edit student records by searching student detail
        Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
        When user logs with valid username "general@teacher.com" and password "123456"
        And clicks on Student Admission under Student Information and creates new student
        And types "77777" in Admission No text box, selects SDET in Class section, selects Testing Fundamentals in Section section
        And types "Nataliia" in First Name text box, selects Female gender and "05/15/1997" in Date of Birth section
        And clicks on Mother box, types "Elena" in Guardian Name text box and "12401111111" in Guardian Phone text box and clicks on a Save button
        And clicks Student Details under Student Information, selects SDET in Class section, selects Testing Fundamentals in Section section and clicks on a search button
        And clicks on a record 77777
        And clicks on an edit button and types "167" in Height text box and clicks on a Save button
        Then user is able to see links displayed "Record Update Successfuly"
        And clicks Student Details under Student Information, selects SDET in Class section, selects Testing Fundamentals in Section section and clicks on a search button
        And clicks on a record 77777
        Then the changed information is displayed
        And clicks on Bulk Delete under Student Information, selects SDET in Class section, selects Testing Fundamentals in Section section and clicks on a search button
        And chooches record and clicks on a Delete button

