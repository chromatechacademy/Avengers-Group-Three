package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.RealEstateLoginStepImpl;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RealEstateLoginStepDef extends PageInitializer {

    @Given("a user is on the CTRE login page {string}")
    public void a_user_is_on_the_CTRE_login_page(String url) {
        WebDriverUtils.driver.get(url);
    }

    @When("a user logs with valid username {string} and password {string}")
    public void a_user_logs_with_valid_username_and_password(String username, String password) {
        RealEstateLoginStepImpl.realEstateLogin(username, password);
        CommonUtils.sleep(3000);
    }

    @Then("user navigates to dashboard page and {string} text displays")
    public void user_navigates_to_dashboard_page_and_text_displays(String helloAdmin) {
        CommonUtils.assertEquals(helloAdmin, realEstateDashboardPage.dashboardHelloAdminText.getText());
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}
