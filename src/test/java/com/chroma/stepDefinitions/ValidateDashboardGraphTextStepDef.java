package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardRealEstatePage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidateDashboardGraphTextStepDef extends PageInitializer {
    
    @When("user clicks on {string} agent module")
    public void user_clicks_on_agent_module(String agentGraph) {
        DashboardRealEstatePage.dynamicXpathForModule(agentGraph).click();
    }
    
    @Then("the graph displays with header text {string}")
    public void the_graph_displays_with_header_text(String reservedByAgents) {
    String actualReservedByAgentsHeadertext = DashboardRealEstatePage.dynamicXpathForHeaderTextOnGraphDisplays(reservedByAgents).getText();
    CommonUtils.assertEquals(reservedByAgents, actualReservedByAgentsHeadertext);
    CucumberLogUtils.logExtentScreenshot();
    CucumberLogUtils.logScreenShot();  
    }
    
    @When("user clicks on {string} agent module under Dashboard")
    public void user_clicks_on_agent_module_under_Dashboard(String overview) {
        DashboardRealEstatePage.dynamicXpathForModule(overview).click();
    }
    
    @Then("the graph displays with the header text {string}")
    public void the_graph_displays_with_the_header_text(String propertiesOverview) {
        String actualPropertiesOverviewHeadertext = DashboardRealEstatePage.dynamicXpathForHeaderTextOnGraphDisplays(propertiesOverview).getText();
    CommonUtils.assertEquals(propertiesOverview, actualPropertiesOverviewHeadertext);
    CucumberLogUtils.logExtentScreenshot();
    CucumberLogUtils.logScreenShot();
    }

}
