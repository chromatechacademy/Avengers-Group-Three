package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.BulkDeletePage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;

public class BulkDeleteStepDef extends PageInitializer {
    @Then("clicks Search")
    public void clicks_Search() {
        BulkDeletePage.searchButton.click();
    }

    @Then("checks the box on the row of student named {string}")
    public void checks_the_box_on_the_row_of_student_named(String studentName) {
        BulkDeletePage.dynamicXpathForCheckBoxInBulkDelete(studentName).click();;
        CommonUtils.sleep(4000);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @Then("clicks Delete button and confirms the allert")
    public void clicks_Delete_button_and_confirms_the_allert() {
        BulkDeletePage.deleteButton.click();
        CommonUtils.sleep(2000);
        CommonUtils.acceptAlert();
        CommonUtils.sleep(3000);
    }
}
