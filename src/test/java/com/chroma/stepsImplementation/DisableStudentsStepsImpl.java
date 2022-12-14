package com.chroma.stepsImplementation;

import org.openqa.selenium.support.ui.Select;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DisableStudentsPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

public class DisableStudentsStepsImpl extends PageInitializer {
    
    /***
     * Use this method to disable student
     * @param disableReason
     */
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

    /***
     * Use this method to enable student
     */
    public void selectStudent() {
        disableStudentsPage.enableButton.click();
        CommonUtils.sleep(1500);
        CommonUtils.acceptAlert();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        CommonUtils.sleep(1500);
    }

    /***
     * Use this method to click on Search button
     */
    public static void clicksOnSearchButton() {
        disableStudentsPage.searchButton.click();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    /***
     * Use this method to select Student
     * @param recordNumber
     * @param studentName
     */
    public static void clicksOnRecordAndSelectsStudent(String recordNumber, String studentName) {
        DisableStudentsPage.dynamicXpathForDisableStudent(studentName).click();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
