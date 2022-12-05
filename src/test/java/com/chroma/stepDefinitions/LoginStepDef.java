package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.LoginStepsImpl;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends PageInitializer {

    @Given("a user is on the CTSMS login page {string}")
    public void a_user_is_on_the_CTSMS_login_page(String url) {
        WebDriverUtils.driver.get(url);
    }

    @When("user logs with valid username {string} and password {string}")
    public void user_logs_with_valid_username_and_password(String username, String password) {
        LoginStepsImpl.login(username, password);
    }

    @Then("user is navigated to the dashboard page and sees text {string}")
    public void user_is_navigated_to_the_dashboard_page_and_sees_text(String chromaTechAcademyText) {
       LoginStepsImpl.verifyDashboardText(chromaTechAcademyText);
    }

    @Then("message {string} displays")
    public void message_displays(String invalidLoginMessage) {
        CommonUtils.sleep(3000);
        LoginStepsImpl.verifyInvalidMessage(invalidLoginMessage);
    }
}
