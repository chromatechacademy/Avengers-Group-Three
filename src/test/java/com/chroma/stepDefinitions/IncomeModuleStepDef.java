package com.chroma.stepDefinitions;

import com.chroma.pages.DashboardPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;

public class IncomeModuleStepDef {

    @Then("user clicks on {string} module")
    public void user_clicks_on_module(String module) {
        DashboardPage.dynamicXpathForModule(module).click();
        CommonUtils.sleep(4000);
    }

    @Then("User has to see folowing links {string}, {string}, {string}")
    public void user_has_to_see_folowing_links(String addIncome, String searchIncome, String incomeHead) {
        String actualAddIncomeText = DashboardPage.dynamicXpathForSubModule(addIncome).getText();
        CommonUtils.assertEquals(addIncome, actualAddIncomeText);

        String actualSearchIncomeText = DashboardPage.dynamicXpathForSubModule(searchIncome).getText();
        CommonUtils.assertEquals(searchIncome, actualSearchIncomeText);

        String actualIncomeHeadText = DashboardPage.dynamicXpathForSubModule(incomeHead).getText();
        CommonUtils.assertEquals(incomeHead, actualIncomeHeadText);

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}

