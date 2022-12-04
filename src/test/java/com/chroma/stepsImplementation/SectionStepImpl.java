package com.chroma.stepsImplementation;

import org.testng.Assert;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

public class SectionStepImpl extends PageInitializer {

    public static void AssertSection() {
        boolean recordSavedBtn = sectionsPage.successSign.isDisplayed();
        CommonUtils.assertTrue(recordSavedBtn);
        boolean testForEveryOneBtn = sectionsPage.addedSection.isDisplayed();
        CommonUtils.assertTrue(testForEveryOneBtn);
        CommonUtils.sleep(6000);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    public static void AssertSectionDelete() {
        sectionsPage.deleteBtn.click();
        CommonUtils.acceptAlert();
        CommonUtils.sleep(6000);
        for (int i = 0; i < sectionsPage.subject.size(); i++) {
            String subjectText = sectionsPage.subject.get(i).getText();
            Assert.assertNotEquals(subjectText, "Testing for everyone");
        }
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
