package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.ConfigReader;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

public class LoginStepsImpl extends PageInitializer {

    /****
     * Use this method to login into CTSMS
     * 
     * @param username
     * @param password
     */
    public static void login(String username, String password) {
        loginPage.usernameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        // CucumberLogUtils.logScreenShot();
        // CucumberLogUtils.logExtentScreenshot();
        loginPage.signInBtn.click();
        if (!ConfigReader.getPropertyValue("browser").equalsIgnoreCase("mobile")) {
            CommonUtils.waitForVisibility(dashboardPage.studentInfoBtn);
        }
    }

    public static void verifyDashboardText(String chromaTechAcademyText) {
        if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase("mobile")) {
            CommonUtils.waitForVisibility(dashboardPage.dashBoardChromaTechText);
        }
        CommonUtils.assertEquals(dashboardPage.dashBoardChromaTechText.getText(), chromaTechAcademyText);
        // CucumberLogUtils.logScreenShot();
        // CucumberLogUtils.logExtentScreenshot();
    }

    public static void verifyInvalidMessage(String invalidLoginMessage) {
        String actualInvalidLoginMessage = loginPage.invalidLoginMessage.getText();
        CommonUtils.assertEquals(invalidLoginMessage, actualInvalidLoginMessage);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
