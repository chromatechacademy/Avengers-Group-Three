Feature: A Real Estate admin user is able to navigate to the dashboard and see graph displays with header text

  @Nataliia @Regression @VNGRS-43
  Scenario: Real Estate - Validate Dashboard Graph Text
    Given a user is on the CTRE login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    When a user scrolls down
    When a user logs with valid username "admin@mexil.it" and password "123456"
    And user clicks on "Agent Graph" agent module
    Then the graph displays with header text "Reserved by Agents"
    When user clicks on "Overview" agent module under Dashboard
    Then the graph displays with the header text "Properties Overview"
