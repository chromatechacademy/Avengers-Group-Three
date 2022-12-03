package com.chroma.stepDefinitions;

import com.chroma.stepsImplementation.HomeworkModuleStepImpl;
import com.chroma.utils.CucumberLogUtils;
import cucumber.api.java.en.Then;

public class HomeworkModuleStepDef {

    @Then("folowing link is displayed {string}")
    public void folowing_link_is_displayed(String addHomeworkLink) {
        HomeworkModuleStepImpl.AssertHomeworkSubModules(addHomeworkLink);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}
