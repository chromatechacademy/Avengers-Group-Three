package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.ConfigReader;
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
        loginPage.signInBtn.click();
<<<<<<< HEAD
//        CommonUtils.waitForVisibility(dashboardPage.studentInfoBtn);
=======
        CommonUtils.nonMobileScreenshots();
    }

    public static void verifyDashboardText(String chromaTechAcademyText) {
        if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase("mobile")) {
            CommonUtils.waitForVisibility(dashboardPage.dashBoardChromaTechText);
        } 
        CommonUtils.nonMobileScreenshots();
        CommonUtils.assertEquals(dashboardPage.dashBoardChromaTechText.getText(), chromaTechAcademyText);
    }

    public static void verifyInvalidMessage(String invalidLoginMessage) {
        String actualInvalidLoginMessage = loginPage.invalidLoginMessage.getText();
        CommonUtils.assertEquals(actualInvalidLoginMessage, invalidLoginMessage);
        CommonUtils.nonMobileScreenshots();
>>>>>>> 1eed7b0a00007819f654f04ffc8875b1545d6463
    }
}
