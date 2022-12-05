package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.StudentInformationModulSpetsImpl;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentInformationModuleStepDef extends PageInitializer {

    @Given("user is on CTSMS home page {string}")
    public void user_is_on_CTSMS_home_page(String url) {
        WebDriverUtils.driver.get(url);
    }

    @When("user clicks on {string}")
    public void user_clicks_on(String string) throws InterruptedException {
        CommonUtils.waitForClickability(dashboardPage.studentInfoBtn);
        dashboardPage.studentInfoBtn.click();
      
    }

    @Then("user is able to see links displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_is_able_to_see_links_displayed(String studentDetails, String studentAdmission,
            String disabledStudents, String bulkDelete, String studentCategories, String studentHouse,
            String disableReason) {
        StudentInformationModulSpetsImpl.AssertStudentInfoModule(studentDetails, studentAdmission, disabledStudents,
                bulkDelete, studentCategories, studentHouse, disableReason);
    }
}
