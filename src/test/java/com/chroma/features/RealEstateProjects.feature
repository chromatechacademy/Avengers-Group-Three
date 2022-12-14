Feature: Validate Projects Module Text

@Mari @VNGRS-48
Scenario: Real Estate - Validate Projects Module Text
Given a user is on the CTRE login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
When a user logs with valid username "admin@mexil.it" and password "123456"
And navigates to "Projects" tab
Then "All Projects" page loads
And we see "Add New Project", "Projects", "Active", and "Archived"
