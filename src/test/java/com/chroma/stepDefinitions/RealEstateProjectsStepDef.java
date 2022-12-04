package com.chroma.stepDefinitions;

import org.openqa.selenium.support.PageFactory;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RealEstateProjectsStepDef extends PageInitializer {

    @When("navigates to {string} tab")
    public void navigates_to_tab(String Projects) {
        realEstateProjectsPage.projectsText.click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("{string} page loads")
    public void page_loads(String actualAllProjectsText) {
        CommonUtils.assertEquals(actualAllProjectsText, realEstateProjectsPage.allProjectsText.getText());
    }

    public RealEstateProjectsStepDef() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
