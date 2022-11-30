package com.chroma.stepsImplementation;

import java.io.IOException;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;

public class LoginStepsImpl extends PageInitializer {
    // Add step implementation methods in this class
    // NOTE: Every step implementation class Extends PageInitializer
    public static void login(String username, String password) throws IOException {
        loginPage.usernameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        //constructor for username and password
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        //methods for both reports
        loginPage.signInBtn.click();

    }
}
