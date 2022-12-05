package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.RealEstateDashboardPage;
import com.chroma.stepsImplementation.ValidateDashboardGraphTextImpl;
import com.chroma.web.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidateDashboardGraphTextStepDef extends PageInitializer {

    @When("user clicks on {string} agent module")
    public void user_clicks_on_agent_module(String agentGraph) {
        //////////
        CommonUtils.waitForVisibility(realEstateDashboardPage.AgentGraphModel);
        CommonUtils.sleep(3000);
        realEstateDashboardPage.AgentGraphModel.click();
    }

    @Then("the graph displays with header text {string}")
    public void the_graph_displays_with_header_text(String reservedByAgents) {
        ValidateDashboardGraphTextImpl.GraphDisplaysAndHeaderTextByAgents(reservedByAgents);
    }

    @When("user clicks on {string} agent module under Dashboard")
    public void user_clicks_on_agent_module_under_Dashboard(String overview) {
        ////////
        CommonUtils.waitForInvisibility(RealEstateDashboardPage.dynamicXpathForModule(overview));
        CommonUtils.sleep(3000);
        RealEstateDashboardPage.dynamicXpathForModule(overview).click();
    }

    @Then("the graph displays with the header text {string}")
    public void the_graph_displays_with_the_header_text(String propertiesOverview) {
        ValidateDashboardGraphTextImpl.GraphDisplaysAndHeaderTextPropertiesOverview(propertiesOverview);
    }
}
