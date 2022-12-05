Feature: An admin user navigates to the “*Agents*” page and able to view the text
@Anastasiia @VNGRS-44 @Progression
Scenario: an admin user is able to view the text on the Agents page
Given a user is on the CTRE login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
When a user logs with valid username "admin@mexil.it" and password "123456"
Then user navigates to dashboard page and "Hello, Admin" text displays
And an admin clicks on Agent page
Then texts "Memebers List", "Active", "Inactive", "All Agents","Add Now", "Name", "Mail", "Contact Number", "Actions" displayed





