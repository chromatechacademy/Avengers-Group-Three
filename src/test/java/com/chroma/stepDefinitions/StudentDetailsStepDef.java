package com.chroma.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.StudentDetailsPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

import cucumber.api.java.en.Then;

public class StudentDetailsStepDef extends PageInitializer {

    @Then("student {string} is deleted")
    public void student_is_deleted(String studentName) {
        StudentDetailsPage.searchByKeywordTextBox.sendKeys(studentName);
        Assert.assertTrue( StudentDetailsPage.noDataAvailableMessage.isDisplayed());
        CommonUtils.sleep(3000);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
