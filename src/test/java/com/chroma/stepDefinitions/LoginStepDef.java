package com.chroma.stepDefinitions;

import java.io.IOException;
import org.junit.Assert;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.LoginPage;
import com.chroma.stepsImplementation.LoginStepsImpl;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
// Add step definitions in this class
// NOTE: Every step definitions class Extends PageInitializer

public class LoginStepDef {

    public LoginPage loginPage = new LoginPage();
    public DashboardPage dashboardPage = new DashboardPage();

    @Given("a user is on the CTSMS login page {string}")
    public void a_user_is_on_the_CTSMS_login_page(String url) {
        WebDriverUtils.driver.get(url);

    }

    @When("user logs with valid username {string} and password {string}")
    public void user_logs_with_valid_username_and_password(String username, String password) throws IOException {
        // cleaner code for username and password
        LoginStepsImpl.login(username, password);
    }

        @When("user logs with valid username {string} and password {string}")
        public void user_logs_with_invalid_username_and_password(String username, String password) throws IOException {
            LoginStepsImpl.login(username, password);
    }

    @Then("user is navigated to the dashboard page")
    public void user_is_navigated_to_the_dashboard_page() {
        boolean isChromaTextDisplayed = dashboardPage.dashBoardChromaTechText.isDisplayed();
        Assert.assertTrue(isChromaTextDisplayed);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

    @Then("message {string} displays")
    public void message_displays(String invalidLoginMessage) {
        String actualInvalidLoginMessage = loginPage.invalidLoginMessage.getText();
        CommonUtils.assertEquals(invalidLoginMessage, actualInvalidLoginMessage);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    

    }
}
