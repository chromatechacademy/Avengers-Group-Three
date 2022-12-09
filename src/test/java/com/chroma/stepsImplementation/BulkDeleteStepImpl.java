package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.BulkDeletePage;
import com.chroma.pages.DashboardPage;
import com.chroma.utils.ConfigReader;
import com.chroma.web.CommonUtils;

public class BulkDeleteStepImpl extends PageInitializer{
    
    /***
     * Use this method to detele Student
     * @param studentName
     * @param className
     * @param sectionName
     * @param subModule
     */
    public void deleteStudent(String admissionNum, String className, String sectionName, String subModule) {
        if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase("mobile")) {
            dashboardPage.toggleNavigationMobile.click();
        }
        DashboardPage.dynamicXpathForSubModuleWithSpace(subModule).click();
        CommonUtils.selectDropDownValue(className, studentAdmissionPage.classDropdown);
        CommonUtils.selectDropDownValue(sectionName, studentAdmissionPage.sectionDropdown);
        BulkDeletePage.searchButton.click();
        CommonUtils.sleep(1000);
        BulkDeletePage.dynamicXpathForCheckBoxInBulkDelete(admissionNum).click();
        CommonUtils.nonMobileScreenshots();
        CommonUtils.sleep(1000);
        BulkDeletePage.deleteButton.click();
        CommonUtils.sleep(1000);
        if (!ConfigReader.getPropertyValue("browser").equalsIgnoreCase("mobile")) {
            CommonUtils.acceptAlert();
        }
        CommonUtils.sleep(1000);
    }
}
