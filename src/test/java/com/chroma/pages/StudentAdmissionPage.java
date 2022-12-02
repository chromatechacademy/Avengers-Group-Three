package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class StudentAdmissionPage extends PageInitializer {
    @FindBy(xpath = "//input[@name='admission_no']")
    public static WebElement admissionNoTextBox;

    @FindBy(xpath = "//input[@name='roll_no']")
    public static WebElement rollNumberTextBox;

    @FindBy(xpath = "//input[@name='firstname']")
    public static WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@name='lastname']")
    public static WebElement lastNameTextBox;

    @FindBy(xpath = "//select[@name='class_id']")
    public static WebElement classDropdown;

    @FindBy(xpath = "//select[@name='section_id']")
    public static WebElement sectionDropdown;

    @FindBy(xpath = "//select[@name='gender']")
    public static WebElement genderDropdown;

    @FindBy(xpath = "//select[@name='category_id']")
    public static WebElement categoryDropdown;

    @FindBy(xpath = "//select[@name='blood_group']")
    public static WebElement bloodGroupDropdown;

    @FindBy(xpath = "//input[@name='email']")
    public static WebElement emailTextBox;

    @FindBy(xpath = "//input[@name='dob']")
    public static WebElement dateOfBirthBox;

    @FindBy(xpath = "//*[@id='admission_date']")
    public static WebElement admissionDateBox;

    @FindBy(xpath = "//td[normalize-space()='9']")
    public static WebElement admissionDateDay;

    @FindBy(xpath = "//input[@name='measure_date']")
    public static WebElement asOfDateBox;

    @FindBy(xpath = "//body/div/div/section/div/div/div/form[@name='employeeform']/div/div[1]/div[1]/div[1]")
    public static WebElement keepDate;

    @FindBy(xpath = "//input[@name='guardian_email']")
    public static WebElement guardianEmail;

    @FindBy(xpath = "//textarea[@name='guardian_address']")
    public static WebElement guardianAddress;

    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public static WebElement saveButton;

    @FindBy(xpath = "//div[normalize-space()='Record Saved Successfully']")
    public static WebElement recordSavedMessage;

    /***
     * Use this method to access Mobile No, Height, Weight
     * @param customTextbox
     * @return
     */
    public static WebElement dynamicXpathMobileHeightWeight(String customTextbox) {
        return WebDriverUtils.driver
                .findElement(By.xpath("//label[contains(text(),'" + customTextbox + "')]//following-sibling::input"));
    }
    
    /**
     * Use this method to access any text box in the guardian parent detail section
     * @param boxLabel
     * @return
     */
    public static WebElement dynamicXpathParentGuardianDetail(String boxLabel) {
        return WebDriverUtils.driver
                .findElement(By.xpath("//label[contains(text(),'" + boxLabel + "')]//following-sibling::input"));
    }
    
    /**
     * Use this method to choose your guardian
     * @param guardian
     * @return
     */
    public static WebElement dynamicXpathForGuardianChoise(String guardian) {
        return WebDriverUtils.driver.findElement(By.xpath("//input[@value='" + guardian + "']"));
    }
    
    /**
     * Use this method to locate a day
     * @param day
     * @return
     */
    public static WebElement dynamicXpathForAdmissionDay(String day) {
        return WebDriverUtils.driver.findElement(By.xpath("//td[normalize-space()='"+day+"']"));
    }


    public StudentAdmissionPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
