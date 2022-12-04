package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;

public class RealEstateLoginStepImpl extends PageInitializer {

    public static void realEstateLogin(String username, String password){
        realEstateLoginPage.usernameTextBox.sendKeys(username);
        realEstateLoginPage.passwordTextBox.sendKeys(password);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        realEstateLoginPage.loginButton.click(); 
    } 
}
