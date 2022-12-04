Feature: Real Estate - Login

@Mari @Regression @VNGRS-41
Scenario: Real Estate - Login with Valid Credentials
Given a user is on the CTRE login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
When a user logs with valid username "admin@mexil.it" and password "123456"
Then user navigates to dashboard page and "Hello, Admin" text displays