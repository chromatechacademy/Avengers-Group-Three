package com.chroma.stepDefinitions;

import com.chroma.stepsImplementation.FeesCollectionStepImpl;
import com.chroma.utils.CucumberLogUtils;
import cucumber.api.java.en.Then;

public class FeesCollectionStepDef {

  @Then("User is able to see folowing links {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
  public void user_is_able_to_see_folowing_links(String collectFeesLink, String searchFeesPaymentLink,
      String searchDueFeesLink, String feesMasterLink, String feesGroupLink, String feesTypeLink,
      String feesDiscountLink, String feesCarryForwardLink, String feesReminderLink) {
    FeesCollectionStepImpl.AssertFeesCollectionSubModules(collectFeesLink, searchFeesPaymentLink, searchDueFeesLink,
        feesMasterLink, feesGroupLink, feesTypeLink, feesDiscountLink, feesCarryForwardLink, feesReminderLink);
    CucumberLogUtils.logExtentScreenshot();
    CucumberLogUtils.logScreenShot();
  }
}
