package com.chroma.stepsImplementation;

import com.chroma.pages.DashboardPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

public class StudentInformationModulSpetsImpl {
    
    /**
     * Method for Assert Student Info Module
     * 
     * @param studentDetails
     * @param studentAdmission
     * @param disabledStudents
     * @param bulkDelete
     * @param studentCategories
     * @param studentHouse
     * @param disableReason
     */
    public static void AssertStudentInfoModule(String studentDetails, String studentAdmission,
            String disabledStudents, String bulkDelete, String studentCategories, String studentHouse,
            String disableReason) {
        CommonUtils.sleep(3000);
        String actualStudentDetails = DashboardPage.dynamicXpathForSubModuleWithSpace(studentDetails).getText();
        CommonUtils.assertEquals(actualStudentDetails, studentDetails);
        String actualStudentAdmission = DashboardPage.dynamicXpathForSubModuleWithSpace(studentAdmission).getText();
        CommonUtils.assertEquals(actualStudentAdmission, studentAdmission);
        String actualDisableStudents = DashboardPage.dynamicXpathForSubModuleWithSpace(disabledStudents).getText();
        CommonUtils.assertEquals(actualDisableStudents, disabledStudents);
        String actualBulkDelete = DashboardPage.dynamicXpathForSubModuleWithSpace(bulkDelete).getText();
        CommonUtils.assertEquals(actualBulkDelete, bulkDelete);
        String actualStudentCategories = DashboardPage.dynamicXpathForSubModuleWithSpace(studentCategories).getText();
        CommonUtils.assertEquals(actualStudentCategories, studentCategories);
        String actualStudentHouse = DashboardPage.dynamicXpathForSubModuleWithSpace(studentHouse).getText();
        CommonUtils.assertEquals(actualStudentHouse, studentHouse);
        String actualDisableReason = DashboardPage.dynamicXpathForSubModuleWithSpace(disableReason).getText();
        CommonUtils.assertEquals(actualDisableReason, disableReason);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
