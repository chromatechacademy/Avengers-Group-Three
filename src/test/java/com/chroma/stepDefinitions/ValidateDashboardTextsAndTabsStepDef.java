package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardRealEstatePage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;

public class ValidateDashboardTextsAndTabsStepDef extends PageInitializer {

    @Then("user is able to see the following elements and their text displayed {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_is_able_to_see_the_following_elements_and_their_text_displayed(String dashboard,
            String helloAdmin, String overview, String agentsGraph, String propertiesOverview, String properties) {
        boolean actualDashboardModuleText = dashboardRealEstatePage.dashboardSideBarModule.isDisplayed();
        CommonUtils.assertTrue(actualDashboardModuleText);
        String actualOverviewModuleText = DashboardRealEstatePage.dynamicXpathForModule(overview).getText();
        CommonUtils.assertEquals(overview, actualOverviewModuleText);
        String actualAgentsGraphModuleText = DashboardRealEstatePage.dynamicXpathForModule(agentsGraph).getText();
        CommonUtils.assertEquals(agentsGraph, actualAgentsGraphModuleText);
        boolean actualHelloAdminText = dashboardRealEstatePage.helloAdminText.isDisplayed();
        CommonUtils.assertTrue(actualHelloAdminText);
        String actualPropertiesOverviewHeaderText = DashboardRealEstatePage
                .dynamicXpathForHeaderTextOnGraphDisplays(propertiesOverview).getText();
        CommonUtils.assertEquals(propertiesOverview, actualPropertiesOverviewHeaderText);
        boolean actualPropertiesText = dashboardRealEstatePage.propertiesText.isDisplayed();
        CommonUtils.assertTrue(actualPropertiesText);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("user is able to see following tabs displayed {string}, {string}, {string}")
    public void user_is_able_to_see_following_tabs_displayed(String agents, String dashboard, String projects) {
        String actualAgentTabsText = DashboardRealEstatePage.dynamicXpathFortabsDisplay(agents).getText();
        CommonUtils.assertEquals(agents, actualAgentTabsText);
        String actualDashboadrTabsText = DashboardRealEstatePage.dynamicXpathFortabsDisplay(dashboard).getText();
        CommonUtils.assertEquals(dashboard, actualDashboadrTabsText);
        String actualProjectsTabsText = DashboardRealEstatePage.dynamicXpathFortabsDisplay(projects).getText();
        CommonUtils.assertEquals(projects, actualProjectsTabsText);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}
