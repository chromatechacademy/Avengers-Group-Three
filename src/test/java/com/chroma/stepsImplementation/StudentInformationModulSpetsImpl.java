package com.chroma.stepsImplementation;

import com.chroma.pages.DashboardPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

public class StudentInformationModulSpetsImpl {
    /**
     * Method for Assert Student Info Module
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

        String actualStudentDetails = DashboardPage.dynamicXpathForSubModule(studentDetails).getText();
        CommonUtils.assertEquals(studentDetails, actualStudentDetails);

        String actualStudentAdmission = DashboardPage.dynamicXpathForSubModule(studentAdmission).getText();
        CommonUtils.assertEquals(studentAdmission, actualStudentAdmission);

        String actualDisableStudents = DashboardPage.dynamicXpathForSubModule(disabledStudents).getText();
        CommonUtils.assertEquals(disabledStudents, actualDisableStudents);

        String actualBulkDelete = DashboardPage.dynamicXpathForSubModule(bulkDelete).getText();
        CommonUtils.assertEquals(bulkDelete, actualBulkDelete);

        String actualStudentCategories = DashboardPage.dynamicXpathForSubModule(studentCategories).getText();
        CommonUtils.assertEquals(studentCategories, actualStudentCategories);

        String actualStudentHouse = DashboardPage.dynamicXpathForSubModule(studentHouse).getText();
        CommonUtils.assertEquals(studentHouse, actualStudentHouse);

        String actualDisableReason = DashboardPage.dynamicXpathForSubModule(disableReason).getText();
        CommonUtils.assertEquals(disableReason, actualDisableReason);

        // screenshots for both reports
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();



    }
    
}

