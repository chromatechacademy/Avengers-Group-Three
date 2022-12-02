package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClassesAndSectionsStepDef extends PageInitializer {

    @When("navigates to {string} module")
    public void navigates_to_module(String module) {
        classesAndSectionsPage.academicsText.click();
    }

    @When("navigates to {string} submodule")
    public void navigates_to_submodule(String submodule) {
        classesAndSectionsPage.classText.click();
    }

    @When("enters {string} in class text box")
    public void enters_in_class_text_box(String classTextBox) {
        classesAndSectionsPage.mariClass.sendKeys("Mari Class");
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @When("checks {string} box")
    public void checks_box(String string) {
        classesAndSectionsPage.sampleSection.click();
        CommonUtils.sleep(2000);
    }

    @When("clicks save")
    public void clicks_save() {
        classesAndSectionsPage.saveButton.click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("{string} displays")
    public void displays(String expectedSavedSuccessfully) {
        String actualSavedSuccessfullyMessage = classesAndSectionsPage.recordSavedSuccessfullyMessage.getText();
        CommonUtils.assertEquals(expectedSavedSuccessfully, actualSavedSuccessfullyMessage);
    }

    @Then("deletes class")
    public void deletes_class() {
        classesAndSectionsPage.deleteMariClass.click();
        CommonUtils.sleep(2000);
        CommonUtils.acceptAlert();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
