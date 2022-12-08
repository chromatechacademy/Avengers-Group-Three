package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;
import com.chroma.utils.ConfigReader;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;
import cucumber.api.java.en.Then;

public class StudentAdmissionStepDef extends PageInitializer {

    @Then("clicks on the {string} module")
    public void clicks_on_the_module(String module) {
       studentAdmissionsStepImpl.navigate(module);
    }

    @Then("clicks on {string} submodule")
    public void clicks_on_submodule(String subModule) {
        DashboardPage.dynamicXpathForSubModuleWithSpace(subModule).click();
    }

    @Then("enters {string} in Admission No text box and {string} in Roll Number text box")
    public void enters_in_Admission_No_text_box_and_in_Roll_Number_text_box(String admissionNo, String rollNo) {
        studentAdmissionsStepImpl.enterAdmissionNoEnterRollNo(admissionNo, rollNo);
    }

    @Then("enters {string} in the First Name text box and {string} in the Last Name text box")
    public void enters_in_the_First_Name_text_box_and_in_the_Last_Name_text_box(String firstName, String lastName) {
        studentAdmissionsStepImpl.enterFirstNameLastName(firstName, lastName);
    }

    @Then("selects {string} from the Class dropdown and {string} from Section dropdown")
    public void selects_from_the_Class_dropdown_and_from_Section_dropdown(String classOption, String sectionOption) {
        studentAdmissionsStepImpl.selectClassDropdownAndSectionDropdown(classOption, sectionOption);
    }

    @Then("selects {string} from the Gender dropdown")
    public void selects_from_the_Gender_dropdown(String genderOption) {
        CommonUtils.selectDropDownValue(genderOption, studentAdmissionPage.genderDropdown);
    }

    @Then("selects {string} from the Category dropdown")
    public void selects_from_the_Category_dropdown(String categoryOption) {
        CommonUtils.selectDropDownValue(categoryOption, studentAdmissionPage.categoryDropdown);
    }

    @Then("enters {string} in the Email text box")
    public void enters_in_the_Email_text_box(String email) {
        studentAdmissionPage.emailTextBox.sendKeys(email);
    }

    @Then("and selects {string} from the Blood Group dropdown")
    public void and_selects_from_the_Blood_Group_dropdown(String bloodGroupOption) {
        CommonUtils.selectDropDownValue(bloodGroupOption, studentAdmissionPage.bloodGroupDropdown);
    }

    @Then("enters {string} in {string} and enters {string} in {string} and enters {string} in {string}")
    public void enters_in_and_enters_in_and_enters_in(String mobileNo, String mobileNoTextBoxLabel, String height,
            String heightTextBoxLabel,
            String weight, String weightTextBoxLabel) {
       studentAdmissionsStepImpl.entersMobileNoAndHeightAndWeight(mobileNo, mobileNoTextBoxLabel, height, heightTextBoxLabel, weight, weightTextBoxLabel);
    }

    @Then("enters {string} in Date of Birth")
    public void enters_in_Date_of_Birth(String birthDate) {
        JavascriptUtils.selectDateByJS(studentAdmissionPage.dateOfBirthBox, birthDate);
    }

    @Then("enters {string} in Admission Date")
    public void enters_in_Admission_Date(String date) {
        JavascriptUtils.selectDateByJS(studentAdmissionPage.admissionDateBox, date);       
    }

    @Then("enters {string} in As on Date")
    public void enters_in_As_on_Date(String asOnDate) {
        JavascriptUtils.selectDateByJS(studentAdmissionPage.asOnDateBox, asOnDate);
    }

    @Then("enters father info as {string} in {string} text box and {string} in {string} text box and {string} in {string} text box")
    public void enters_father_info_as_in_text_box_and_in_text_box_and_in_text_box(String fatherName,
            String fatherNameBoxLabel,
            String fatherPhone, String fatherPhoneBoxLabel, String fatherOccupation, String fatherOccupationBoxLabel) {
        studentAdmissionsStepImpl.entersFatherInformation(fatherName, fatherNameBoxLabel, fatherPhone, fatherPhoneBoxLabel, fatherOccupation, fatherOccupationBoxLabel);
    }

    @Then("enters mother info as {string} in {string} text box and {string} in {string} text box and {string} in {string} text box")
    public void enters_mother_info_as_in_text_box_and_in_text_box_and_in_text_box(String motherName,
            String motherNameBoxLabel,
            String motherPhone, String motherPhoneBoxLabel, String motherOccupation, String motherOccupationBoxLabel) {
        studentAdmissionsStepImpl.entersMotherInformation(motherName, motherNameBoxLabel, motherPhone, motherPhoneBoxLabel, motherOccupation, motherOccupationBoxLabel);
    }

    @Then("navigates to If Guardian is and clicks on the radio button in front of {string}")
    public void navigates_to_If_Guardian_is_and_clicks_on_the_radio_button_in_front_of(String guardian) {
        studentAdmissionsStepImpl.navigateToGuardianChooseGuardian(guardian);
    }

    @Then("enters {string} in Guardian Email text box and {string} in the Guardian address text box")
    public void enters_in_Guardian_Email_text_box_and_in_the_Guardian_address_text_box(String email, String address) {
        studentAdmissionsStepImpl.entersGuardianEmailAndGuardianAddress(email, address);
    }

    @Then("clicks Save")
    public void clicks_Save() {
        studentAdmissionPage.saveButton.click();
    }

    @Then("student is admitted and {string} is displayed")
    public void student_is_admitted_and_is_displayed(String recordSavedMessage) {
        studentAdmissionsStepImpl.verifyStudentAdmission(recordSavedMessage);
    }
    
    @Then("student record with admission No {string} in Class {string} in section {string} is deleted through {string} submodule")
    public void student_record_with_admission_No_in_Class_in_section_is_deleted_through_submodule(String studentName, String className, String sectionName, String subModule) {
        bulkDeleteStepImpl.deleteStudent(studentName, className, sectionName, subModule);
    }
}