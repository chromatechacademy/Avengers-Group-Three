package com.chroma.stepsImplementation;

import org.openqa.selenium.support.ui.Select;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

public class DisableStudentsStepsImpl extends PageInitializer {
    public void disableStudent(String disableReason) {
        disableStudentsPage.disableButton.click();
        CommonUtils.sleep(1500);
        CommonUtils.acceptAlert();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        CommonUtils.sleep(1500);
        CommonUtils.switchToFrame(disableStudentsPage.iframeText);
        Select reason = new Select(disableStudentsPage.disableDropdown);
        reason.selectByVisibleText(disableReason);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        disableStudentsPage.saveButton.click();
        CommonUtils.sleep(2000);
    }

    public void selectStudent() {
        disableStudentsPage.enableButton.click();
        CommonUtils.sleep(1500);
        CommonUtils.acceptAlert();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        CommonUtils.sleep(1500);

    }
}
