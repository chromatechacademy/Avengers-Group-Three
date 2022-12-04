Feature: A Real Estate admin user is able to validate the following elements, tabs and their text display on the dashboard

  @Regression @Nataliia @VNGRS-42
  Scenario: Real Estate - Validate Dashboard Texts and Tabs
    Given a user is on the CTRE login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    When a user scrolls down
    When a user logs with valid username "admin@mexil.it" and password "123456"
    Then user is able to see the following elements and their text displayed "Dashboard", "Hello, Admin", "Overview", "Agents Graph", "Properties Overview", "Properties"
    And user is able to see following tabs displayed "Agents", "Dashboard", "Projects"
