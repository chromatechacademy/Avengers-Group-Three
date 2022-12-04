Feature: A Real Estate admin user is able to navigate to the dashboard and see graph displays with header text

    @Nataliia @ @VNGRS-43
    Scenario: Real Estate - Validate Dashboard Graph Text
        When user clicks on "Agent Graph" agent module
        Then the graph displays with header text "Reserved by Agents"
        When user clicks on "Overview" agent module under Dashboard
        Then the graph displays with the header text "Properties Overview"

