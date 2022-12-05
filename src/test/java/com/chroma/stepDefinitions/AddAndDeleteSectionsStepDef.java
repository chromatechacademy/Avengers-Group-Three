package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.SectionStepImpl;
import com.chroma.web.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddAndDeleteSectionsStepDef extends PageInitializer {

    @When("user clicks on {string} and {string}")
    public void user_clicks_on_and(String academics, String sections) {
        CommonUtils.sleep(3000);
        sectionsPage.academicsBtn.click();
        sectionsPage.sectionBtn.click();
    }

    @When("user enters {string} in the Section name and click on Save")
    public void user_enters_in_the_Section_name_and_click_on_Save(String testingForEveryone) {
        sectionsPage.text.sendKeys(testingForEveryone);
        sectionsPage.saveBtn.click();
    }

    @When("Record Saved Successfully and  Testing for everyone appeared in the Section List")
    public void record_Saved_Successfully_and_Testing_for_everyone_appeared_in_the_Section_List() {
        SectionStepImpl.AssertSection();
    }

    @Then("user clicks on delete and deleted Testing for everyone from the Section List")
    public void user_clicks_on_delete_and_deleted_Testing_for_everyone_from_the_Section_List() {
        SectionStepImpl.AssertSectionDelete();
    }
}
