package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class StudentAdmissionPage extends PageInitializer {

    //Locator for Admission No
    @FindBy(xpath = "//input[@name='admission_no']")
    public static WebElement admissionNoTextBox;

    //Locator for Roll Number
    @FindBy(xpath = "//input[@name='roll_no']")
    public static WebElement rollNumberTextBox;

    //Locator for First Name text box
    @FindBy(xpath = "//input[@name='firstname']")
    public static WebElement firstNameTextBox;

    //Locator for lirst Name text box
    @FindBy(xpath = "//input[@name='lastname']")
    public static WebElement lastNameTextBox;

    //Locator for Class dropdown
    @FindBy(xpath = "//select[@name='class_id']")
    public static WebElement classDropdown;

    //Locator for Section dropdown
    @FindBy(xpath = "//select[@name='section_id']")
    public static WebElement sectionDropdown;

    //Locator for Gender dropdown
    @FindBy(xpath = "//select[@name='gender']")
    public static WebElement genderDropdown;

    //Locator for Category dropdown
    @FindBy(xpath = "//select[@name='category_id']")
    public static WebElement categoryDropdown;

    //Locator for Blood Group dropdown
    @FindBy(xpath = "//select[@name='blood_group']")
    public static WebElement bloodGroupDropdown;

    //Locator for Email text box
    @FindBy(xpath = "//input[@name='email']")
    public static WebElement emailTextBox;

    //Locator for Date of Birth box
    @FindBy(xpath = "//input[@name='dob']")
    public static WebElement dateOfBirthBox;

    //Locator for Admission Date box
    @FindBy(xpath = "//*[@id='admission_date']")
    public static WebElement admissionDateBox;

    //Locator for As on Date box
    @FindBy(xpath = "//input[@name='measure_date']")
    public static WebElement asOnDateBox;

    //Locator for Guardian Email text box
    @FindBy(xpath = "//input[@name='guardian_email']")
    public static WebElement guardianEmail;

    //Locator for Guardian Address text box
    @FindBy(xpath = "//textarea[@name='guardian_address']")
    public static WebElement guardianAddress;

    //Locator for save button
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public static WebElement saveButton;

    //Locator for Record Saved Message
    @FindBy(xpath = "//div[normalize-space()='Record Saved Successfully']")
    public static WebElement recordSavedMessage;

    /***
     * Use this method to locate Mobile No, Height, Weight
     * @param customTextbox
     * @return
     */
    public static WebElement dynamicXpathMobileHeightWeight(String customTextbox) {
        return WebDriverUtils.driver
                .findElement(By.xpath("//label[contains(text(),'" + customTextbox + "')]//following-sibling::input"));
    }
    
    /**
     * Use this method to locate any text box in the guardian parent detail section
     * @param boxLabel
     * @return
     */
    public static WebElement dynamicXpathParentGuardianDetail(String boxLabel) {
        return WebDriverUtils.driver
                .findElement(By.xpath("//label[contains(text(),'" + boxLabel + "')]//following-sibling::input"));
    }
    
    /**
     * Use this method to locate radio button in front of desired guardian
     * @param guardian
     * @return
     */
    public static WebElement dynamicXpathForGuardianChoise(String guardian) {
        return WebDriverUtils.driver.findElement(By.xpath("//input[@value='" + guardian + "']"));
    }
    
    public StudentAdmissionPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
