package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.BulkDeletePage;
import com.chroma.pages.DashboardPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

public class BulkDeleteStepImpl extends PageInitializer{
    
    /***
     * Use this method to detele Student
     * @param studentName
     * @param className
     * @param sectionName
     * @param subModule
     */
    public void deleteStudent(String studentName, String className, String sectionName, String subModule) {
        DashboardPage.dynamicXpathForSubModuleWithSpace(subModule).click();
        CommonUtils.selectDropDownValue(className, studentAdmissionPage.classDropdown);
        CommonUtils.selectDropDownValue(sectionName, studentAdmissionPage.sectionDropdown);
        BulkDeletePage.searchButton.click();
        CommonUtils.sleep(1000);
        BulkDeletePage.dynamicXpathForCheckBoxInBulkDelete(studentName).click();;
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        BulkDeletePage.deleteButton.click(); 
        CommonUtils.acceptAlert();
        CommonUtils.sleep(1000);
    }
}
