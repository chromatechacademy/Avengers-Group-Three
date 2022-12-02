package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;
import com.chroma.stepsImplementation.AcademicsModuleStepsImpl;
import com.chroma.web.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AcademicsStepDef extends PageInitializer {

    // @When("user clicks on {string} module")
    // public void user_clicks_on_module(String module) throws InterruptedException {
    //     DashboardPage.dynamicXpathForModule(module).click();
    //     CommonUtils.sleep(3000);
    // }

    @Then("user is able to see submodules displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_is_able_to_see_submodules_displayed(String classTimetableLink, String teachersTimetablelink,
            String assignClassTeacherlink, String promoteStudentsLink,
            String subjectGroupLink, String subjectsLink, String classLink, String sectionsLink) {

                AcademicsModuleStepsImpl.AssertAcademicsSubModules(classTimetableLink, teachersTimetablelink, assignClassTeacherlink, 
                promoteStudentsLink, subjectGroupLink, subjectsLink, classLink, sectionsLink);


    }
}
