Feature: A CTSMS user is able to see Navigation modules on portal

    @Nataliia @Progression @VNGRS-3
    Scenario: Navigation modules are displayed on portal
        Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
        When user logs with valid username "general@teacher.com" and password "123456"
        Then user is able to see links displayed "Student Information", "Fees Collection", "Income", "Expenses", "Academics", "Human Resource", "Homework", "Reports"
