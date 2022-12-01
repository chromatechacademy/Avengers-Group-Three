package com.chroma.stepDefinitions;

import org.openqa.selenium.By;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;
import com.chroma.utils.CucumberLogUtils;
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
        // JavascriptUtils.clickByJS(WebDriverUtils.driver.findElement(By.xpath("//span[normalize-space()='Student
        // Information']")));
        WebDriverUtils.driver.findElement(By.xpath("//span[normalize-space()='Student Information']")).click();
        Thread.sleep(2000);

    }

    @Then("user is able to see links displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_is_able_to_see_links_displayed(String studentDetails, String studentAdmission,
            String disabledStudents, String bulkDelete, String studentCategories, String studentHouse,
            String disableReason) {

        CommonUtils.sleep(3000);

        String actualStudentDetails = DashboardPage.dynamicXpathForSubModule(studentDetails).getText();
        CommonUtils.assertEquals(studentDetails, actualStudentDetails);

        String actualStudentAdmission = DashboardPage.dynamicXpathForSubModule(studentAdmission).getText();
        CommonUtils.assertEquals(studentAdmission, actualStudentAdmission);

        String actualDisableStudents = DashboardPage.dynamicXpathForSubModule(disabledStudents).getText();
        CommonUtils.assertEquals(disabledStudents, actualDisableStudents);

        String actualBulkDelete = DashboardPage.dynamicXpathForSubModule(bulkDelete).getText();
        CommonUtils.assertEquals(bulkDelete, actualBulkDelete);

        String actualStudentCategories = DashboardPage.dynamicXpathForSubModule(studentCategories).getText();
        CommonUtils.assertEquals(studentCategories, actualStudentCategories);

        String actualStudentHouse = DashboardPage.dynamicXpathForSubModule(studentHouse).getText();
        CommonUtils.assertEquals(studentHouse, actualStudentHouse);

        String actualDisableReason = DashboardPage.dynamicXpathForSubModule(disableReason).getText();
        CommonUtils.assertEquals(disableReason, actualDisableReason);

        // screenshots for both reports
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

}
