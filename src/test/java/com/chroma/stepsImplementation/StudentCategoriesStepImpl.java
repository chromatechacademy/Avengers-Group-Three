package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.StudentCategoriesPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

public class StudentCategoriesStepImpl extends PageInitializer {
    
    /***
     * Use this method to delete Category
     * @param category
     */
    public void deletingStudentCategory(String category){
        StudentCategoriesPage.dynamixCategoryLocatorXButton(category).click();
        CommonUtils.sleep(2000);
        CommonUtils.acceptAlert();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    /***
     * Use this method enter and save Category
     * @param category
     */
    public void enteringAndSavingStudentCategory(String category){
        studentCategories.categoryTextBox.sendKeys(category);
        studentCategories.categorySaveButton.click();
        CommonUtils.sleep(2000);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    /***
     * Use this method verify that expected Category is displayed
     * @param expectedCategory
     */
    public void verifyingStudentCategoryIsDisplayed(String expectedCategory){
        String actualCategoryText = StudentCategoriesPage.dynamixCategoryText(expectedCategory).getText();
        CommonUtils.assertEquals(expectedCategory, actualCategoryText);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}