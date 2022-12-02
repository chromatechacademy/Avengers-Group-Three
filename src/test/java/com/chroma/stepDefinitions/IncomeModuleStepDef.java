package com.chroma.stepDefinitions;

import org.junit.Assert;
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
        boolean isAddIncomeDisplayed = DashboardPage.dynamicXpathForSubModule(addIncome).getText()
                .contentEquals(addIncome);
        Assert.assertTrue(isAddIncomeDisplayed);
        System.out.println(isAddIncomeDisplayed);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        boolean isSearchIncomeDisplayed = DashboardPage.dynamicXpathForSubModule(searchIncome).getText()
                .contentEquals(searchIncome);
        Assert.assertTrue(isSearchIncomeDisplayed);
        System.out.println(isSearchIncomeDisplayed);
        boolean isIncomeHeadDisplayed = DashboardPage.dynamicXpathForSubModule(incomeHead).getText()
                .contentEquals(incomeHead);
        Assert.assertTrue(isIncomeHeadDisplayed);
        System.out.println(isIncomeHeadDisplayed);
    }
}