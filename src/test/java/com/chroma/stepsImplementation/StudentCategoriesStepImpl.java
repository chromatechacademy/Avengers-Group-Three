package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.StudentCategories;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

public class StudentCategoriesStepImpl extends PageInitializer {
    
    public void deletingStudentCategory(String category){
        StudentCategories.dynamixCategoryLocatorXButton(category).click();
        CommonUtils.sleep(2000);
        CommonUtils.acceptAlert();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    public void enteringAndSavingStudentCategory(String category){
        studentCategories.categoryTextBox.sendKeys(category);
        studentCategories.categorySaveButton.click();
        CommonUtils.sleep(2000);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    public void verifyingStudentCategoryIsDisplayed(String expectedCategory){
        String actualCategoryText = StudentCategories.dynamixCategoryText(expectedCategory).getText();
        CommonUtils.assertEquals(expectedCategory, actualCategoryText);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}