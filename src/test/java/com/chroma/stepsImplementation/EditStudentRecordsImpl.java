package com.chroma.stepsImplementation;

import org.openqa.selenium.support.ui.Select;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.BulkDeletePage;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.EditStudentPage;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

public class EditStudentRecordsImpl extends PageInitializer {

    /**
     * Method for navigation student record
     * 
     * @param studentDetails
     * @param sdet
     * @param databaseTesting
     */

    public static void NavigationToRecord(String studentDetails, String sdet, String databaseTesting) {

        DashboardPage.dynamicXpathForSubModuleWithSpace(studentDetails).click();
        Select classIdDropDown = new Select(EditStudentPage.classDropDown);
        classIdDropDown.selectByVisibleText(sdet);
        Select sectionIdDropDown = new Select(EditStudentPage.sectionDropDown);
        sectionIdDropDown.selectByVisibleText(databaseTesting);
        EditStudentPage.searchBarBtn.click();
        EditStudentPage.studentRecordBtn.click();

    }

    /**
     * Method for delete student record
     * 
     * @param marleneFishen
     * @param bulkDelete
     * @param sdet
     * @param databaseTesting
     */
    public static void DeleteRecord(String marleneFishen, String bulkDelete, String sdet,
            String databaseTesting) {

        DashboardPage.dynamicXpathForSubModuleWithSpace(bulkDelete).click();
        Select classIdDropDown = new Select(EditStudentPage.classDropDown);
        classIdDropDown.selectByVisibleText(sdet);
        Select sectionIdDropDown = new Select(EditStudentPage.sectionDropDown);
        sectionIdDropDown.selectByVisibleText(databaseTesting);
        EditStudentPage.searchBarBtn.click();
        CommonUtils.sleep(2000);
        BulkDeletePage.dynamicXpathForCheckBoxInBulkDelete(marleneFishen).click();
        CommonUtils.sleep(2000);
        BulkDeletePage.deleteButton.click();
        CommonUtils.sleep(2000);
        WebDriverUtils.driver.switchTo().alert().accept();

    }

    public static void BloodInfoChanging(String aGroup) {

        Select bloodGroupDropDown = new Select(EditStudentPage.bloodGroupDropDown);
        bloodGroupDropDown.selectByVisibleText(aGroup);
        CommonUtils.scrollIntoView(EditStudentPage.saveChangesBnt);
        EditStudentPage.saveChangesBnt.click();

    }
}