package com.chroma.stepsImplementation;

import java.util.ArrayList;
import org.testng.Assert;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.RealEstateDashboardPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

public class ValidateDashboardTextsAndTabsImpl extends PageInitializer {

    /**
     * Method for following elements and text
     * 
     * @param dashboard
     * @param helloAdmin
     * @param overview
     * @param agentsGraph
     * @param propertiesOverview
     * @param properties
     */
    public static void FollowingElementsAndText(String dashboard,
            String helloAdmin, String overview, String agentsGraph, String propertiesOverview, String properties) {
        boolean actualDashboardModuleText = realEstateDashboardPage.dashboardSideBarModule.isDisplayed();
        CommonUtils.assertTrue(actualDashboardModuleText);
        String actualOverviewModuleText = RealEstateDashboardPage.dynamicXpathForModule(overview).getText();
        CommonUtils.assertEquals(actualOverviewModuleText, overview);
        String actualAgentsGraphModuleText = RealEstateDashboardPage.dynamicXpathForModule(agentsGraph).getText();
        CommonUtils.assertEquals(actualAgentsGraphModuleText, agentsGraph);
        boolean actualHelloAdminText = realEstateDashboardPage.dashboardHelloAdminText.isDisplayed();
        CommonUtils.assertTrue(actualHelloAdminText);
        String actualPropertiesOverviewHeaderText = RealEstateDashboardPage
                .dynamicXpathForHeaderTextOnGraphDisplays(propertiesOverview).getText();
        CommonUtils.assertEquals(actualPropertiesOverviewHeaderText, propertiesOverview);
        boolean actualPropertiesText = realEstateDashboardPage.propertiesText.isDisplayed();
        CommonUtils.assertTrue(actualPropertiesText);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Method for following tabs
     * 
     * @param agents
     * @param dashboard
     * @param projects
     */
    public static void FollowingTabs(String agents, String dashboard, String projects) {
        ArrayList<String> expectedTabOptions = new ArrayList<String>();
        expectedTabOptions.add(agents);
        expectedTabOptions.add(dashboard);
        expectedTabOptions.add(projects);
        for (int i = 0; i < expectedTabOptions.size(); i++) {
            Assert.assertEquals(realEstateDashboardPage.tabsOptions.get(i).getText(), expectedTabOptions.get(i));
        }
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}