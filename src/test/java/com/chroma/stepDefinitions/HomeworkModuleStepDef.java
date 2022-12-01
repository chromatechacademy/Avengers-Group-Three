package com.chroma.stepDefinitions;

import com.chroma.pages.DashboardPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;

public class HomeworkModuleStepDef {

    @Then("folowing link is displayed {string}")
public void folowing_link_is_displayed(String addHomework) {
    String actualAddHomeworkText = DashboardPage.dynamicXpathForSubModule(addHomework).getText();
        CommonUtils.assertEquals(addHomework, actualAddHomeworkText);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}
    
