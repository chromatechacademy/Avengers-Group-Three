package com.chroma.stepsImplementation;

import org.openqa.selenium.support.ui.Select;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.BulkDeletePage;
import com.chroma.pages.DashboardPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

public class EditStudentRecordsImpl extends PageInitializer {

    /**
     * Use this method to navigation student record
     * 
     * @param studentDetails
     * @param sdet
     * @param databaseTesting
     */
    public static void NavigationToRecord(String studentDetails, String sdet, String databaseTesting) {
        DashboardPage.dynamicXpathForSubModuleWithSpace(studentDetails).click();
        Select classIdDropDown = new Select(editStudentPage.classDropDown);
        classIdDropDown.selectByVisibleText(sdet);
        Select sectionIdDropDown = new Select(editStudentPage.sectionDropDown);
        sectionIdDropDown.selectByVisibleText(databaseTesting);
        editStudentPage.searchBarBtn.click();
        editStudentPage.studentRecordBtn.click();
        CommonUtils.sleep(2000);
    }

    /**
     * Use this method to delete student record
     * 
     * @param marleneFishen
     * @param bulkDelete
     * @param sdet
     * @param databaseTesting
     */
    public static void DeleteRecord(String marleneFishen, String bulkDelete, String sdet,
            String databaseTesting) {
        DashboardPage.dynamicXpathForSubModuleWithSpace(bulkDelete).click();
        Select classIdDropDown = new Select(editStudentPage.classDropDown);
        classIdDropDown.selectByVisibleText(sdet);
        Select sectionIdDropDown = new Select(editStudentPage.sectionDropDown);
        sectionIdDropDown.selectByVisibleText(databaseTesting);
        editStudentPage.searchBarBtn.click();
        CommonUtils.sleep(2000);
        BulkDeletePage.dynamicXpathForCheckBoxInBulkDelete(marleneFishen).click();
        CommonUtils.sleep(2000);
        BulkDeletePage.deleteButton.click();
        CommonUtils.sleep(2000);
        WebDriverUtils.driver.switchTo().alert().accept();
        CommonUtils.sleep(2000);
    }

    /**
     * Use this method to change blood group
     * 
     * @param aGroup
     */
    public static void BloodInfoChanging(String aGroup) {
        Select bloodGroupDropDown = new Select(editStudentPage.bloodGroupDropDown);
        bloodGroupDropDown.selectByVisibleText(aGroup);
        CommonUtils.scrollIntoView(editStudentPage.saveChangesBnt);
        editStudentPage.saveChangesBnt.click();
        CommonUtils.sleep(3000);
    }

    /***
     * Use this method to verify that record was updated successfully
     */
    public static void recordRecordUpdateSuccessfully() {
        boolean resultsForRecordUpdateSuccessfulyAppears = editStudentPage.resultsForRecordUpdateSuccessfuly
                .isDisplayed();
        CommonUtils.assertTrue(resultsForRecordUpdateSuccessfulyAppears);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    /***
     * Use this method to verify that changed student information is displayed
     */
    public static void verifyChangedInformationIsDisplayed() {
        boolean resultsForChangedIngormationAppear = editStudentPage.bloodAOption.isDisplayed();
        CommonUtils.assertTrue(resultsForChangedIngormationAppear);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}