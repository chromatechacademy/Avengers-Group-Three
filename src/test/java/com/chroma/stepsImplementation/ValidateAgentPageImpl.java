package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

public class ValidateAgentPageImpl extends PageInitializer {
    public static void AssertSections(String members, String active, String inactive, String allAgents, String addNow, String name, String mail, String contactNumber, String actions) {
        boolean membersSign = validateAgentModulePage.membersSign.isDisplayed();
        CommonUtils.assertTrue(membersSign);
        boolean activeSign = validateAgentModulePage.activeSign.isDisplayed();
        CommonUtils.assertTrue(activeSign);
        boolean inactiveSign = validateAgentModulePage.inactiveSign.isDisplayed();
        CommonUtils.assertTrue(inactiveSign);
        boolean allAgentsign = validateAgentModulePage.allAgentsign.isDisplayed();
        CommonUtils.assertTrue(allAgentsign);
        boolean addNowsign = validateAgentModulePage.addNowsign.isDisplayed();
        CommonUtils.assertTrue(addNowsign);
        boolean nameSign = validateAgentModulePage.nameSign.isDisplayed();
        CommonUtils.assertTrue(nameSign);
        boolean mailSign = validateAgentModulePage.mailSign.isDisplayed();
        CommonUtils.assertTrue(mailSign);
        boolean contactNumberSign = validateAgentModulePage.contactNumberSign.isDisplayed();
        CommonUtils.assertTrue(contactNumberSign);
        boolean actionsSign = validateAgentModulePage.actionsSign.isDisplayed();
        CommonUtils.assertTrue(actionsSign);
        // screenshoots
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }   
}
