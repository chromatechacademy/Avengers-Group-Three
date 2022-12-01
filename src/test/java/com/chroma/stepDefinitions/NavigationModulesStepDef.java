package com.chroma.stepDefinitions;

import org.testng.Assert;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;
import com.chroma.stepsImplementation.NavigationModulesStepsImpl;
import com.chroma.utils.CucumberLogUtils;

import cucumber.api.java.en.Then;

public class NavigationModulesStepDef extends PageInitializer {

    @Then("user is able to see links displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_is_able_to_see_links_displayed(String studentInformation, String feesCollection, String income,
            String expenses, String academics, String humanResource, String homework, String reports) {

        NavigationModulesStepsImpl.AssertNavigationModules(studentInformation, feesCollection, income, expenses,
                academics, humanResource, homework, reports);

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

}
