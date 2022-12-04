package com.chroma.stepsImplementation;

import com.chroma.pages.RealEstateDashboardPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

public class ValidateDashboardGraphTextImpl {

    /**
     * Method for Header Text By Agents
     * 
     * @param reservedByAgents
     */
    public static void GraphDisplaysAndHeaderTextByAgents(String reservedByAgents) {
        String actualReservedByAgentsHeadertext = RealEstateDashboardPage
                .dynamicXpathForHeaderTextOnGraphDisplays(reservedByAgents).getText();
        CommonUtils.assertEquals(actualReservedByAgentsHeadertext, reservedByAgents);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Method for Header Text Properties Overview
     * 
     * @param propertiesOverview
     */
    public static void GraphDisplaysAndHeaderTextPropertiesOverview(String propertiesOverview) {
        String actualPropertiesOverviewHeadertext = RealEstateDashboardPage
                .dynamicXpathForHeaderTextOnGraphDisplays(propertiesOverview).getText();
        CommonUtils.assertEquals(actualPropertiesOverviewHeadertext, propertiesOverview);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}
