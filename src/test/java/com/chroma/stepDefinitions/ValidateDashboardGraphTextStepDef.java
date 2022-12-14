package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.RealEstateDashboardPage;
import com.chroma.stepsImplementation.ValidateDashboardGraphTextImpl;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidateDashboardGraphTextStepDef extends PageInitializer {

    @When("user clicks on {string} agent module")
    public void user_clicks_on_agent_module(String agentGraph) {
        realEstateDashboardPage.AgentGraphModel.click();
    }

    @Then("the graph displays with header text {string}")
    public void the_graph_displays_with_header_text(String reservedByAgents) {
        ValidateDashboardGraphTextImpl.GraphDisplaysAndHeaderTextByAgents(reservedByAgents);
    }

    @When("user clicks on {string} agent module under Dashboard")
    public void user_clicks_on_agent_module_under_Dashboard(String overview) {
        RealEstateDashboardPage.dynamicXpathForModule(overview).click();
    }

    @Then("the graph displays with the header text {string}")
    public void the_graph_displays_with_the_header_text(String propertiesOverview) {
        ValidateDashboardGraphTextImpl.GraphDisplaysAndHeaderTextPropertiesOverview(propertiesOverview);
    }
}
