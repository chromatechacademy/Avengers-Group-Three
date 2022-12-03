package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;
import com.chroma.web.CommonUtils;

public class IncomeModuleStepImpl extends PageInitializer{
    /**
     * @param addIncomeLink
     * @param searchIncomelink
     * @param incomeHeadlink
     */
    public static void AssertIncomeSubModules(String addIncomeLink, String searchIncomeLink,
    String incomeHeadLink) {
        String actualAddIncome = DashboardPage.dynamicXpathForSubModule(addIncomeLink)
                .getText();
        CommonUtils.assertEquals(addIncomeLink, actualAddIncome);
    }
}
