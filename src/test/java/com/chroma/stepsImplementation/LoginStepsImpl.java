package com.chroma.stepsImplementation;

import java.io.IOException;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;

public class LoginStepsImpl extends PageInitializer {
    
    public static void login(String username, String password) throws IOException {
        // constructor for username and password
        loginPage.usernameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        // methods for both reports
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

        loginPage.signInBtn.click();

    }
}
