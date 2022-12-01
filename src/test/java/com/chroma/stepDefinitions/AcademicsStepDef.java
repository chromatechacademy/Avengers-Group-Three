package com.chroma.stepDefinitions;

import org.openqa.selenium.By;

import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AcademicsStepDef extends WebDriverUtils {

    @When("user clicks on {string} module")
    public void user_clicks_on_module(String module) throws InterruptedException {
        WebDriverUtils.driver.findElement(By.xpath("//span[contains(text(),'" + module + "')]")).click();
        Thread.sleep(3000);
    }

    @Then("user is able to see submodules displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_is_able_to_see_submodules_displayed(String classTimetableLink, String teachersTimetablelink,
            String assignClassTeacherlink, String promoteStudentsLink,
            String subjectGroupLink, String subjectsLink, String classLink, String sectionsLink) {

    }
}
