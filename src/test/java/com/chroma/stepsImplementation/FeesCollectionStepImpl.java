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
        CommonUtils.assertEquals(collectFeesLink, actualCollectFeesLink);
        String actualSearchFeesPaymentLink = DashboardPage.dynamicXpathForSubModule(searchFeesPaymentLink)
                .getText();
        CommonUtils.assertEquals(searchFeesPaymentLink, actualSearchFeesPaymentLink);
        String actualSearchDueFeesLinK = DashboardPage.dynamicXpathForSubModule(searchDueFeesLink)
                .getText();
        CommonUtils.assertEquals(searchDueFeesLink, actualSearchDueFeesLinK);
        String actualFeesMasterLink = DashboardPage.dynamicXpathForSubModule(feesMasterLink)
                .getText();
        CommonUtils.assertEquals(feesMasterLink, actualFeesMasterLink);
        String actualFeesGroupLink = DashboardPage.dynamicXpathForSubModule(feesGroupLink)
                .getText();
        CommonUtils.assertEquals(feesGroupLink, actualFeesGroupLink);
        String actualFeesTypeLink = DashboardPage.dynamicXpathForSubModule(feesTypeLink)
                .getText();
        CommonUtils.assertEquals(feesTypeLink, actualFeesTypeLink);
        String actualFeesDiscountLink = DashboardPage.dynamicXpathForSubModule(feesDiscountLink)
                .getText();
        CommonUtils.assertEquals(feesDiscountLink, actualFeesDiscountLink);
        String actualFeesCarryForwardLink = DashboardPage.dynamicXpathForSubModule(feesCarryForwardLink)
                .getText();
        CommonUtils.assertEquals(feesCarryForwardLink, actualFeesCarryForwardLink);
        String actualFeesReminderLink = DashboardPage.dynamicXpathForSubModule(feesReminderLink)
                .getText();
        CommonUtils.assertEquals(feesReminderLink, actualFeesReminderLink);
    }
}
