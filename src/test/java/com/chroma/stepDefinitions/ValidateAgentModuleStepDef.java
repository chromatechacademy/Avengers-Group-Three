package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.ValidateAgentPageImpl;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ValidateAgentModuleStepDef extends PageInitializer {

    @Given("an admin clicks on Agent page")
    public void an_admin_clicks_on_Agent_page() {
        validateAgentModulePage.agentBtn.click();
    }

    @Then("texts {string}, {string}, {string}, {string},{string}, {string}, {string}, {string}, {string} displayed")
    public void texts_displayed(String members, String active, String inactive, String allAgents, String addNow,
            String name, String mail, String contactNumber, String actions) {
                ValidateAgentPageImpl.AssertSections(members, active, inactive, allAgents, addNow, name, mail, contactNumber, actions);
                ValidateAgentPageImpl.AssertSections(members, active, inactive, allAgents, addNow, name, mail, contactNumber, actions);
                ValidateAgentPageImpl.AssertSections(members, active, inactive, allAgents, addNow, name, mail, contactNumber, actions);
                ValidateAgentPageImpl.AssertSections(members, active, inactive, allAgents, addNow, name, mail, contactNumber, actions);
                ValidateAgentPageImpl.AssertSections(members, active, inactive, allAgents, addNow, name, mail, contactNumber, actions);
                ValidateAgentPageImpl.AssertSections(members, active, inactive, allAgents, addNow, name, mail, contactNumber, actions);
                ValidateAgentPageImpl.AssertSections(members, active, inactive, allAgents, addNow, name, mail, contactNumber, actions);
                ValidateAgentPageImpl.AssertSections(members, active, inactive, allAgents, addNow, name, mail, contactNumber, actions);
                ValidateAgentPageImpl.AssertSections(members, active, inactive, allAgents, addNow, name, mail, contactNumber, actions);

    }
}
