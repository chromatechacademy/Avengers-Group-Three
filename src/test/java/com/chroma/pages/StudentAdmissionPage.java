package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class StudentAdmissionPage {

    /* Admission No text box */
    @FindBy(xpath = "//input[@name='admission_no']")
    public WebElement admissionNoTextBox;

    /* Roll Number text box */
    @FindBy(xpath = "//input[@name='roll_no']")
    public WebElement rollNumberTextBox;

    /* First Name text box */
    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstNameTextBox;

    /* Last Name text box */
    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastNameTextBox;

    /* Class dropdown */
    @FindBy(xpath = "//select[@name='class_id']")
    public WebElement classDropdown;

    /* Section dropdown */
    @FindBy(xpath = "//select[@name='section_id']")
    public WebElement sectionDropdown;

    /* Gender dropdown */
    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropdown;

    /* Category dropdown */
    @FindBy(xpath = "//select[@name='category_id']")
    public WebElement categoryDropdown;

    /* Blood Group dropdown */
    @FindBy(xpath = "//select[@name='blood_group']")
    public WebElement bloodGroupDropdown;

    /* Email text box */
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextBox;

    /* Date of Birth box */
    @FindBy(xpath = "//input[@name='dob']")
    public WebElement dateOfBirthBox;

    /* Admission Date box */
    @FindBy(xpath = "//*[@id='admission_date']")
    public WebElement admissionDateBox;

    /* As on Date box */
    @FindBy(xpath = "//input[@name='measure_date']")
    public WebElement asOnDateBox;

    /* Guardian Email text box */
    @FindBy(xpath = "//input[@name='guardian_email']")
    public WebElement guardianEmail;

    /* Guardian Address text box */
    @FindBy(xpath = "//textarea[@name='guardian_address']")
    public WebElement guardianAddress;

    /* save button */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    /* Record Saved Message */
    @FindBy(xpath = "//div[normalize-space()='Record Saved Successfully']")
    public WebElement recordSavedMessage;

    /***
     * Use this method to locate Mobile No, Height, Weight
     * 
     * @param customTextbox
     * @return
     */
    public static WebElement dynamicXpathMobileHeightWeight(String customTextbox) {
        return WebDriverUtils.driver
                .findElement(By.xpath("//label[contains(text(),'" + customTextbox + "')]//following-sibling::input"));
    }

    /**
     * Use this method to locate any text box in the guardian parent detail section
     * 
     * @param boxLabel
     * @return
     */
    public static WebElement dynamicXpathParentGuardianDetail(String boxLabel) {
        return WebDriverUtils.driver
                .findElement(By.xpath("//label[contains(text(),'" + boxLabel + "')]//following-sibling::input"));
    }

    /**
     * Use this method to locate radio button in front of desired guardian
     * 
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
