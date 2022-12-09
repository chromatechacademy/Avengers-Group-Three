package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;
import com.chroma.web.CommonUtils;

public class FeesCollectionStepImpl extends PageInitializer {
    /**
     * 
     * @param collectFeesLink
     * @param searchFeesPaymentLink
     * @param searchDueFeesLink
     * @param feesMasterLink
     * @param feesGroupLink
     * @param feesDiscountLink
     * @param feesTypeLink
     * @param feesCarryForwardLink
     * @param feesReminderLink
     */
    public static void AssertFeesCollectionSubModules(String collectFeesLink, String searchFeesPaymentLink,
            String searchDueFeesLink, String feesMasterLink,
            String feesGroupLink, String feesDiscountLink, String feesTypeLink, String feesCarryForwardLink,
            String feesReminderLink) {
        String actualCollectFeesLink = DashboardPage.dynamicXpathForSubModule(collectFeesLink)
                .getText();
        CommonUtils.assertEquals(actualCollectFeesLink, collectFeesLink);
        String actualSearchFeesPaymentLink = DashboardPage.dynamicXpathForSubModule(searchFeesPaymentLink)
                .getText();
        CommonUtils.assertEquals(actualSearchFeesPaymentLink, searchFeesPaymentLink);
        String actualSearchDueFeesLinK = DashboardPage.dynamicXpathForSubModule(searchDueFeesLink)
                .getText();
        CommonUtils.assertEquals(actualSearchDueFeesLinK, searchDueFeesLink);
        String actualFeesMasterLink = DashboardPage.dynamicXpathForSubModule(feesMasterLink)
                .getText();
        CommonUtils.assertEquals(actualFeesMasterLink, feesMasterLink);
        String actualFeesGroupLink = DashboardPage.dynamicXpathForSubModule(feesGroupLink)
                .getText();
        CommonUtils.assertEquals(actualFeesGroupLink, feesGroupLink);
        String actualFeesTypeLink = DashboardPage.dynamicXpathForSubModule(feesTypeLink)
                .getText();
        CommonUtils.assertEquals(actualFeesTypeLink,feesTypeLink);
        String actualFeesDiscountLink = DashboardPage.dynamicXpathForSubModule(feesDiscountLink)
                .getText();
        CommonUtils.assertEquals(actualFeesDiscountLink, feesDiscountLink);
        String actualFeesCarryForwardLink = DashboardPage.dynamicXpathForSubModule(feesCarryForwardLink)
                .getText();
        CommonUtils.assertEquals(actualFeesCarryForwardLink, feesCarryForwardLink);
        String actualFeesReminderLink = DashboardPage.dynamicXpathForSubModule(feesReminderLink)
                .getText();
        CommonUtils.assertEquals(actualFeesReminderLink, feesReminderLink);
    }
}
