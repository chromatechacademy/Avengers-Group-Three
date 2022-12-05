package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.ValidateDashboardTextsAndTabsImpl;
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
        CommonUtils.sleep(3000);
        ValidateDashboardTextsAndTabsImpl.FollowingElementsAndText(dashboard, helloAdmin, overview, agentsGraph,
                propertiesOverview, properties);
    }

    @Then("user is able to see following tabs displayed {string}, {string}, {string}")
    public void user_is_able_to_see_following_tabs_displayed(String agents, String dashboard, String projects) {
        CommonUtils.sleep(4000);
        ValidateDashboardTextsAndTabsImpl.FollowingTabs(agents, dashboard, projects);
    }
}
