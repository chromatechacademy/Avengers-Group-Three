Feature: Student Categories Scenarios

  @Regression @BeginnerWay @Chroma @VNGRS-20
  Scenario: CTSMS - Ability to add and delete student categories
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
    When user logs with valid username "general@teacher.com" and password "123456"
    When user clicks on "Student Information" module
    And clicks on "Student Categories" submodule
    And enters Student Category "AUTOMATED CATEGORY"
    And verifies that Category "AUTOMATED CATEGORY" is displayed
    Then Category "AUTOMATED CATEGORY" is deleted

  @Regression @ChromaTechStudentWay @Chroma @VNGRS-20
  Scenario Outline: CTSMS - Ability to add and delete student categories
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
    When user logs with valid username "general@teacher.com" and password "123456"
    When user clicks on "Student Information" module
    And clicks on "Student Categories" submodule
    And enters Student Category "<categoryText>"
    And verifies that Category "<categoryText>" is displayed
    Then Category "<categoryText>" is deleted
    Examples: 
      | categoryText         |
      | AUTOMOMATED TEST ONE |
      | AUTOMATED TEST TWO   |
      | AUTOMATED TEST THREE |
      | AUTOMATED TEST FOUR  |
