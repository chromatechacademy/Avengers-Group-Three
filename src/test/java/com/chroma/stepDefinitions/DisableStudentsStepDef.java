package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DisableStudentsPage;
import com.chroma.utils.CucumberLogUtils;
import cucumber.api.java.en.Then;

public class DisableStudentsStepDef extends PageInitializer {

    @Then("clicks on a search button")
    public void clicks_on_a_search_button() {
        disableStudentsPage.searchButton.click();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @Then("clicks on a record {string} and selects the student {string}")
    public void clicks_on_a_record_and_selects_the_student(String recordNumber, String studentName) {
        DisableStudentsPage.dynamicXpathForDisableStudent(studentName).click();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @Then("disables student for a reason {string} and accepts alert")
    public void disables_student_for_a_reason_and_accepts_alert(String disableReason) {
        disableStudentsStepsImpl.disableStudent(disableReason);
    }

    @Then("enables student and accepts alert")
    public void enables_student_and_accepts_alert() {
        disableStudentsStepsImpl.selectStudent();
    }
}