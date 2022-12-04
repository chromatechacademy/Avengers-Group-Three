package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;

import cucumber.api.java.en.Then;

public class ValidateDashboardTextsAndTabsStepDef extends PageInitializer {
    
    @Then("user is able to see module on the left side of page and its text displayed {string}")
    public void user_is_able_to_see_module_on_the_left_side_of_page_and_its_text_displayed(String dashboard) {
    }
    
    @Then("user is able to see page title and its text displayed {string}")
    public void user_is_able_to_see_page_title_and_its_text_displayed(String helloAdmin) {
    }
    
    @Then("user is able to see following modules and their text displayed {string} and {string}")
    public void user_is_able_to_see_following_modules_and_their_text_displayed_and(String overview, String agentsGraph) {
    }
    
    @Then("user is able yo see graph displays with header text displayed information {string}")
    public void user_is_able_yo_see_graph_displays_with_header_text_displayed_information(String propertiesOverview) {
    }
    
    @Then("user is able yo see following element and its text displayed {string}")
    public void user_is_able_yo_see_following_element_and_its_text_displayed(String properties) {
    }
    
    @Then("user is able to see following tabs displayed {string}, {string}, {string}")
    public void user_is_able_to_see_following_tabs_displayed(String agents, String dashboard, String projects) {
    }
}
