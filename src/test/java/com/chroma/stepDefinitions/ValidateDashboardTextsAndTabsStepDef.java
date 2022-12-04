package com.chroma.stepDefinitions;

import java.util.ArrayList;
import org.testng.Assert;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.RealEstateDashboardPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidateDashboardTextsAndTabsStepDef extends PageInitializer {

    @When("a user scrolls down")
    public void a_user_scrolls_down() {
        JavascriptUtils.scrollDown(300);
    }

    @Then("user is able to see the following elements and their text displayed {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_is_able_to_see_the_following_elements_and_their_text_displayed(String dashboard,
            String helloAdmin, String overview, String agentsGraph, String propertiesOverview, String properties) {
        boolean actualDashboardModuleText = realEstateDashboardPage.dashboardSideBarModule.isDisplayed();
        CommonUtils.assertTrue(actualDashboardModuleText);
        String actualOverviewModuleText = RealEstateDashboardPage.dynamicXpathForModule(overview).getText();
        CommonUtils.assertEquals(overview, actualOverviewModuleText);
        String actualAgentsGraphModuleText = RealEstateDashboardPage.dynamicXpathForModule(agentsGraph).getText();
        CommonUtils.assertEquals(agentsGraph, actualAgentsGraphModuleText);
        boolean actualHelloAdminText = realEstateDashboardPage.dashboardHelloAdminText.isDisplayed();
        CommonUtils.assertTrue(actualHelloAdminText);
        String actualPropertiesOverviewHeaderText = RealEstateDashboardPage
                .dynamicXpathForHeaderTextOnGraphDisplays(propertiesOverview).getText();
        CommonUtils.assertEquals(propertiesOverview, actualPropertiesOverviewHeaderText);
        boolean actualPropertiesText = realEstateDashboardPage.propertiesText.isDisplayed();
        CommonUtils.assertTrue(actualPropertiesText);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("user is able to see following tabs displayed {string}, {string}, {string}")
    public void user_is_able_to_see_following_tabs_displayed(String agents, String dashboard, String projects) {
        ArrayList<String> expectedTabOptions = new ArrayList<String>();
        expectedTabOptions.add(agents);
        expectedTabOptions.add(dashboard);
        expectedTabOptions.add(projects);
        for (int i = 0; i < expectedTabOptions.size(); i++) {
            Assert.assertEquals(expectedTabOptions.get(i), realEstateDashboardPage.tabsOptions.get(i).getText());
        }
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}
