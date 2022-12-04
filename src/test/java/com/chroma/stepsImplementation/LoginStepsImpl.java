package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;

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
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        loginPage.signInBtn.click();
    }
}
