package com.chroma.stepDefinitions;

import com.chroma.stepsImplementation.ExpensesModuleStepImpl;
import com.chroma.utils.CucumberLogUtils;
import cucumber.api.java.en.Then;

public class ExpensesModuleStepDef {

    @Then("folowing links are displayed {string}, {string}, {string}")
    public void folowing_links_are_displayed(String addExpense, String searchExpense, String expenseHead) {
        ExpensesModuleStepImpl.AssertExpensesSubModules(addExpense, searchExpense, expenseHead);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}
