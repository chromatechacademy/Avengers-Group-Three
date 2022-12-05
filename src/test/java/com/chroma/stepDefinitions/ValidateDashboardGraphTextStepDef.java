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
        CommonUtils.sleep(5000);
        realEstateDashboardPage.AgentGraphModel.click();
        CommonUtils.sleep(5000);
    }

    @Then("the graph displays with header text {string}")
    public void the_graph_displays_with_header_text(String reservedByAgents) {
        CommonUtils.sleep(5000);
        ValidateDashboardGraphTextImpl.GraphDisplaysAndHeaderTextByAgents(reservedByAgents);
    }

    @When("user clicks on {string} agent module under Dashboard")
    public void user_clicks_on_agent_module_under_Dashboard(String overview) {
        CommonUtils.sleep(5000);
        RealEstateDashboardPage.dynamicXpathForModule(overview).click();
    }

    @Then("the graph displays with the header text {string}")
    public void the_graph_displays_with_the_header_text(String propertiesOverview) {
        CommonUtils.sleep(5000);
        ValidateDashboardGraphTextImpl.GraphDisplaysAndHeaderTextPropertiesOverview(propertiesOverview);
    }
}
