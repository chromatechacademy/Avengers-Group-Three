package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class EditStudentPage extends PageInitializer {
    // class dropDown
    @FindBy(xpath = "//select[@name='class_id']")
    public static WebElement classDropDown;

    // section dropDown
    @FindBy(xpath = "//select[@name='section_id']")
    public static WebElement sectionDropDown;

    // searchBar btn
    @FindBy(xpath = "//button[@value='search_filter']")
    public static WebElement searchBarBtn;

    // student record bnt
    @FindBy(xpath = "//tr[@role='row']//a[contains(text(),'Marlene Fisher')]")
    public static WebElement studentRecordBtn;

    // edit student record bnt
    @FindBy(xpath = "//a[@title='Edit']//i")
    public static WebElement editStudentRecordBtn;

    // blood group Drop Down
    @FindBy(xpath = "//select[@name='blood_group']")
    public static WebElement bloodGroupDropDown;

    // blood a+ option
    @FindBy(xpath = "//td[normalize-space()='A+']")
    public static WebElement bloodAOption;

    // save changes bnt
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public static WebElement saveChangesBnt;

    // results for record update successfuly
    @FindBy(xpath = "//div[@student='alert alert-success text-left']")
    public static WebElement resultsForRecordUpdateSuccessfuly;

    public EditStudentPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
