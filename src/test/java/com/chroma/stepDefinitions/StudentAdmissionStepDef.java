package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.StudentAdmissionPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;

public class StudentAdmissionStepDef extends PageInitializer {

    @Then("clicks on the {string} module")
    public void clicks_on_the_module(String module) {
        DashboardPage.dynamicXpathForModule(module).click();
    }

    @Then("clicks on {string} submodule")
    public void clicks_on_submodule(String subModule) {
        DashboardPage.dynamicXpathForSubModuleWithSpace(subModule).click();
        CommonUtils.sleep(3000);
    }

    @Then("enters {string} in Admission No text box and {string} in Roll Number text box")
    public void enters_in_Admission_No_text_box_and_in_Roll_Number_text_box(String admissionNo, String rollNo) {
        StudentAdmissionPage.rollNumberTextBox.sendKeys(rollNo);
        StudentAdmissionPage.admissionNoTextBox.sendKeys(admissionNo);
    }

    @Then("enters {string} in the First Name text box and {string} in the Last Name text box")
    public void enters_in_the_First_Name_text_box_and_in_the_Last_Name_text_box(String firstName, String lastName) {
        StudentAdmissionPage.firstNameTextBox.sendKeys(firstName);
        StudentAdmissionPage.lastNameTextBox.sendKeys(lastName);
    }

    @Then("selects {string} from the Class dropdown and {string} from Section dropdown")
    public void selects_from_the_Class_dropdown_and_from_Section_dropdown(String classOption, String sectionOption) {
        CommonUtils.selectDropDownValue(classOption, StudentAdmissionPage.classDropdown);
        CommonUtils.selectDropDownValue(sectionOption, StudentAdmissionPage.sectionDropdown);
    }

    @Then("selects {string} from the Gender dropdown")
    public void selects_from_the_Gender_dropdown(String genderOption) {
        CommonUtils.selectDropDownValue(genderOption, StudentAdmissionPage.genderDropdown);
    }

    @Then("selects {string} from the Category dropdown")
    public void selects_from_the_Category_dropdown(String categoryOption) {
        CommonUtils.selectDropDownValue(categoryOption, StudentAdmissionPage.categoryDropdown);
    }

    @Then("enters {string} in the Email text box")
    public void enters_in_the_Email_text_box(String email) {
        StudentAdmissionPage.emailTextBox.sendKeys(email);
    }

    @Then("and selects {string} from the Blood Group dropdown")
    public void and_selects_from_the_Blood_Group_dropdown(String bloodGroupOption) {
        CommonUtils.selectDropDownValue(bloodGroupOption, StudentAdmissionPage.bloodGroupDropdown);
    }

    @Then("enters {string} in {string} and enters {string} in {string} and enters {string} in {string}")
    public void enters_in_and_enters_in_and_enters_in(String mobileNo, String mobileNoTextBoxLabel, String height,
            String heightTextBoxLabel,
            String weight, String weightTextBoxLabel) {
        StudentAdmissionPage.dynamicXpathMobileHeightWeight(mobileNoTextBoxLabel).sendKeys(mobileNo);
        StudentAdmissionPage.dynamicXpathMobileHeightWeight(heightTextBoxLabel).sendKeys(height);
        StudentAdmissionPage.dynamicXpathMobileHeightWeight(weightTextBoxLabel).sendKeys(weight);
        CommonUtils.sleep(2000);
    }

    @Then("enters {string} in Date of Birth")
    public void enters_in_Date_of_Birth(String birthDate) {
        StudentAdmissionPage.dateOfBirthBox.sendKeys(birthDate);
        StudentAdmissionPage.keepDate.click();
        CommonUtils.sleep(2000);
    }

    @Then("enters December {string} in Admission Date")
    public void enters_December_in_Admission_Date(String day) {
        StudentAdmissionPage.admissionDateBox.click();
        StudentAdmissionPage.dynamicXpathForAdmissionDay(day).click();
        CommonUtils.sleep(2000);
    }

    @Then("enters {string} in As on Date")
    public void enters_in_As_on_Date(String asOfDate) {
        CommonUtils.sendKeys(StudentAdmissionPage.asOfDateBox, asOfDate);
        StudentAdmissionPage.keepDate.click();
        CommonUtils.sleep(2000);
    }

    @Then("enters father info as {string} in {string} text box and {string} in {string} text box and {string} in {string} text box")
    public void enters_father_info_as_in_text_box_and_in_text_box_and_in_text_box(String fatherName,
            String fatherNameBoxLabel,
            String fatherPhone, String fatherPhoneBoxLabel, String fatherOccupation, String fatherOccupationBoxLabel) {
        StudentAdmissionPage.dynamicXpathParentGuardianDetail(fatherNameBoxLabel).sendKeys(fatherName);
        StudentAdmissionPage.dynamicXpathParentGuardianDetail(fatherPhoneBoxLabel).sendKeys(fatherPhone);
        StudentAdmissionPage.dynamicXpathParentGuardianDetail(fatherOccupationBoxLabel).sendKeys(fatherOccupation);
    }

    @Then("enters mother info as {string} in {string} text box and {string} in {string} text box and {string} in {string} text box")
    public void enters_mother_info_as_in_text_box_and_in_text_box_and_in_text_box(String motherName,
            String motherNameBoxLabel,
            String motherPhone, String motherPhoneBoxLabel, String motherOccupation, String motherOccupationBoxLabel) {
        StudentAdmissionPage.dynamicXpathParentGuardianDetail(motherNameBoxLabel).sendKeys(motherName);
        StudentAdmissionPage.dynamicXpathParentGuardianDetail(motherPhoneBoxLabel).sendKeys(motherPhone);
        StudentAdmissionPage.dynamicXpathParentGuardianDetail(motherOccupationBoxLabel).sendKeys(motherOccupation);
        CommonUtils.sleep(2000);
    }

    @Then("navigates to If Gaurdian is and clicks on the radio button in front of {string}")
    public void navigates_to_If_Gaurdian_is_and_clicks_on_the_radio_button_in_front_of(String guardian) {
        CommonUtils.scrollIntoView(StudentAdmissionPage.guardianAddress);
        StudentAdmissionPage.dynamicXpathForGuardianChoise(guardian).click();
        CommonUtils.sleep(2000);
    }

    @Then("enters {string} in Gaurdian Email text box and {string} in the Gaurdian address text box")
    public void enters_in_Gaurdian_Email_text_box_and_in_the_Gaurdian_address_text_box(String email, String address) {
        StudentAdmissionPage.guardianEmail.sendKeys(email);
        StudentAdmissionPage.guardianAddress.sendKeys(address);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @Then("clicks Save")
    public void clicks_Save() {
        StudentAdmissionPage.saveButton.click();
    }

    @Then("student is admitted and {string} is displayed")
    public void student_is_admitted_and_is_displayed(String recordSavedMessage) {
        CommonUtils.assertEquals(recordSavedMessage, StudentAdmissionPage.recordSavedMessage.getText());
        CommonUtils.sleep(3500);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
