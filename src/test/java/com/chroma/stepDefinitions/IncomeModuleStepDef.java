package com.chroma.stepDefinitions;

import org.junit.Assert;
import com.chroma.pages.DashboardPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

import cucumber.api.java.en.Then;

public class IncomeModuleStepDef {
    DashboardPage dashboardPage = new DashboardPage();

    @Then("user clicks on {string} module")
    public void user_clicks_on_module(String module) {
        DashboardPage.dynamicXpathForModule(module).click();
    }

    @Then("User has to see folowing links {string}, {string}, {string}")
    public void user_has_to_see_folowing_links(String addIncome, String searchIncome, String incomeHead) {
        String actualAddIncomeText = DashboardPage.dynamicXpathForSubModule(addIncome).getText();
        CommonUtils.assertEquals(addIncome, actualAddIncomeText);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }
}
