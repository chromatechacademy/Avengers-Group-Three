package com.chroma.stepDefinitions;

import com.chroma.pages.DashboardPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;

public class ExpensesModuleStepDef {

    @Then("folowing links are displayed {string}, {string}, {string}")
public void folowing_links_are_displayed(String addExpense, String searchExpense, String expenseHead) {
    String actualAddExpenseText = DashboardPage.dynamicXpathForSubModule(addExpense).getText();
    CommonUtils.assertEquals(addExpense, actualAddExpenseText);

    String actualSearchExpenseText = DashboardPage.dynamicXpathForSubModule(searchExpense).getText();
    CommonUtils.assertEquals(searchExpense, actualSearchExpenseText);

    String actualExpenseHeadText = DashboardPage.dynamicXpathForSubModule(expenseHead).getText();
    CommonUtils.assertEquals(expenseHead, actualExpenseHeadText);

    CucumberLogUtils.logExtentScreenshot();
    CucumberLogUtils.logScreenShot();
    }
}
