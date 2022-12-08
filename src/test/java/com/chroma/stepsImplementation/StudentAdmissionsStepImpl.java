package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.StudentAdmissionPage;
import com.chroma.utils.ConfigReader;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;

public class StudentAdmissionsStepImpl extends PageInitializer {

    public void navigate(String navigateToModule) {
        if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase("mobile")) {
            dashboardPage.toggleNavigationMobile.click();
        }
        DashboardPage.dynamicXpathForModule(navigateToModule).click();
    }

    /***
     * Use this method to enter Admission No and Roll number
     * 
     * @param admissionsNumber
     * @param rollNumber
     */
    public void enterAdmissionNoEnterRollNo(String admissionsNumber, String rollNumber) {
        studentAdmissionPage.admissionNoTextBox.sendKeys(admissionsNumber);
        studentAdmissionPage.rollNumberTextBox.sendKeys(rollNumber);
    }

    /***
     * Use this method to enter First Name and Last Name
     * 
     * @param firstName
     * @param lastName
     */
    public void enterFirstNameLastName(String firstName, String lastName) {
        studentAdmissionPage.firstNameTextBox.sendKeys(firstName);
        studentAdmissionPage.lastNameTextBox.sendKeys(lastName);
    }

    /***
     * Use this method to select Class form Class dropdown and Section from Section
     * dropdown
     * 
     * @param classOption
     * @param sectionOption
     */
    public void selectClassDropdownAndSectionDropdown(String classOption, String sectionOption) {
        CommonUtils.selectDropDownValue(classOption, studentAdmissionPage.classDropdown);
        CommonUtils.selectDropDownValue(sectionOption, studentAdmissionPage.sectionDropdown);
    }

    /***
     * Use this method to enter Mobile Number, Height and Weight
     * 
     * @param mobileNumber
     * @param mobileNumberTextBoxLabel
     * @param height
     * @param heightTextBoxLabel
     * @param weight
     * @param weightTextBoxLabel
     */
    public void entersMobileNoAndHeightAndWeight(String mobileNumber, String mobileNumberTextBoxLabel, String height,
            String heightTextBoxLabel,
            String weight, String weightTextBoxLabel) {
        StudentAdmissionPage.dynamicXpathMobileHeightWeight(mobileNumberTextBoxLabel).sendKeys(mobileNumber);
        StudentAdmissionPage.dynamicXpathMobileHeightWeight(heightTextBoxLabel).sendKeys(height);
        StudentAdmissionPage.dynamicXpathMobileHeightWeight(weightTextBoxLabel).sendKeys(weight);
    }

    /***
     * Use this method to enter Father Name, Father Phone and Father Occupation
     * 
     * @param fatherName
     * @param fatherNameBoxLabel
     * @param fatherPhone
     * @param fatherPhoneBoxLabel
     * @param fatherOccupation
     * @param fatherOccupationBoxLabel
     */
    public void entersFatherInformation(String fatherName,
            String fatherNameBoxLabel,
            String fatherPhone, String fatherPhoneBoxLabel, String fatherOccupation, String fatherOccupationBoxLabel) {
        StudentAdmissionPage.dynamicXpathParentGuardianDetail(fatherNameBoxLabel).sendKeys(fatherName);
        StudentAdmissionPage.dynamicXpathParentGuardianDetail(fatherPhoneBoxLabel).sendKeys(fatherPhone);
        StudentAdmissionPage.dynamicXpathParentGuardianDetail(fatherOccupationBoxLabel).sendKeys(fatherOccupation);
    }

    /***
     * Use this method to enter Mother Name, Mother Phone and Mother Occupation
     * 
     * @param motherName
     * @param motherNameBoxLabel
     * @param motherPhone
     * @param motherPhoneBoxLabel
     * @param motherOccupation
     * @param motherOccupationBoxLabel
     */
    public void entersMotherInformation(String motherName,
            String motherNameBoxLabel,
            String motherPhone, String motherPhoneBoxLabel, String motherOccupation, String motherOccupationBoxLabel) {
        StudentAdmissionPage.dynamicXpathParentGuardianDetail(motherNameBoxLabel).sendKeys(motherName);
        StudentAdmissionPage.dynamicXpathParentGuardianDetail(motherPhoneBoxLabel).sendKeys(motherPhone);
        StudentAdmissionPage.dynamicXpathParentGuardianDetail(motherOccupationBoxLabel).sendKeys(motherOccupation);
    }

    /***
     * Use this method to navigate to Guardian Detail Section and to choose Guardian
     * 
     * @param guardianChoise
     */
    public void navigateToGuardianChooseGuardian(String guardianChoise) {
        JavascriptUtils.scrollIntoView(studentAdmissionPage.guardianAddress);
        StudentAdmissionPage.dynamicXpathForGuardianChoise(guardianChoise).click();
    }

    /***
     * Use this method to enter Guardian Email and Guardian Address
     * 
     * @param guardianEmail
     * @param guardianAddress
     */
    public void entersGuardianEmailAndGuardianAddress(String guardianEmail, String guardianAddress) {
        studentAdmissionPage.guardianEmail.sendKeys(guardianEmail);
        studentAdmissionPage.guardianAddress.sendKeys(guardianAddress);
        if (!ConfigReader.getPropertyValue("browser").equalsIgnoreCase("mobile")) {
            CucumberLogUtils.logScreenShot();
            CucumberLogUtils.logExtentScreenshot();
        }
    }

    /***
     * Use this method to assert Student Admission
     * 
     * @param recordSavedMessage
     */
    public void verifyStudentAdmission(String recordSavedMessage) {
        CommonUtils.waitForVisibility(studentAdmissionPage.recordSavedMessage);
        CommonUtils.assertEquals(recordSavedMessage, studentAdmissionPage.recordSavedMessage.getText());
        if (!ConfigReader.getPropertyValue("browser").equalsIgnoreCase("mobile")) {
            CucumberLogUtils.logScreenShot();
            CucumberLogUtils.logExtentScreenshot();
        }
    }
}
