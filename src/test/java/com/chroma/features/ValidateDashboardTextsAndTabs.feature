Feature: A Real Estate admin user is able to validate the following elements, tabs and their text display on the dashboard

    @Nataliia @Progression @VNGRS-42
    Scenario: Real Estate - Validate Dashboard Texts and Tabs 
        Then user is able to see module on the left side of page and its text displayed "Dashboard"
        And user is able to see page title and its text displayed "Hello, Admin" 
        And user is able to see following modules and their text displayed "Overview" and "Agents Graph"
        And user is able yo see graph displays with header text displayed information "Properties Overview"
        And user is able yo see following element and its text displayed "Properties"
        And user is able to see following tabs displayed "Agents", "Dashboard", "Projects"
