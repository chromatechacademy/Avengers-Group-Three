package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

public class LoginStepsImpl extends PageInitializer {

    public static void login(String username, String password) {
        loginPage.usernameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        loginPage.signInBtn.click();
        CommonUtils.waitForVisibility(dashboardPage.studentInfoBtn);
    }
}
