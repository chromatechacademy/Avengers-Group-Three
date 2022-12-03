package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;
import com.chroma.web.CommonUtils;

public class ExpensesModuleStepImpl extends PageInitializer {
        /**
         * 
         * @param addExpensesLink
         * @param searchExpenseLink
         * @param expenseHeadLink
         */
        public static void AssertExpensesSubModules(String addExpenseLink, String searchExpenseLink,
                        String expenseHeadLink) {
                String actualAddExpenseLink = DashboardPage.dynamicXpathForSubModuleWithSpace(addExpenseLink)
                                .getText();
                CommonUtils.assertEquals(addExpenseLink, actualAddExpenseLink);
                String actualSearchExpenseLink = DashboardPage.dynamicXpathForSubModuleWithSpace(searchExpenseLink)
                                .getText();
                CommonUtils.assertEquals(searchExpenseLink, actualSearchExpenseLink);
                String actualExpenseHeadLink = DashboardPage.dynamicXpathForSubModuleWithSpace(expenseHeadLink)
                                .getText();
                CommonUtils.assertEquals(expenseHeadLink, actualExpenseHeadLink);
        }
}
