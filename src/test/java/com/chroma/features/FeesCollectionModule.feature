Feature: Income Module content 
We need to test the content of fees collection module 
@Hayk @Regression @VNGRS-5
Scenario: Fees Collection module
Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
When user logs with valid username "general@teacher.com" and password "123456"
Then user is navigated to the dashboard page and sees text "Chroma Tech Academy"
And user clicks on "Fees Collection" module
Then User is able to see folowing links "Collect Fees", "Search Fees Payment", "Search Due Fees", "Fees Master", "Fees Group", "Fees Type", "Fees Discount", "Fees Carry Forward", "Fees Reminder"