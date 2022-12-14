package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.EditStudentRecordsImpl;
import cucumber.api.java.en.Then;

public class EditStudentRecordsStepDef extends PageInitializer {

        @Then("user clicks on {string}, looks for a studend in a {string} class and {string} section, chooshes and clicks on edit button")
        public void user_clicks_on_looks_for_a_studend_in_a_class_and_section_chooshes_and_clicks_on_edit_button(
                        String studentDetails, String sdet, String databaseTesting) {
                EditStudentRecordsImpl.NavigationToRecord(studentDetails, sdet, databaseTesting);
                editStudentPage.editStudentRecordBtn.click();
        }

        @Then("user edits a record by adding Blood Group {string}")
        public void user_edits_a_record_by_adding_Blood_Group(String aGroup) {
                EditStudentRecordsImpl.BloodInfoChanging(aGroup);
        }

        @Then("user is able to see Record Update Successfully information")
        public void user_is_able_to_see_Record_Update_Successfully_information() {
                EditStudentRecordsImpl.recordRecordUpdateSuccessfully();
        }

        @Then("user clicks on {string}, looks for a studend in a {string} class and {string} section, chooshes and clicks on student")
        public void user_clicks_on_looks_for_a_studend_in_a_class_and_section_chooshes_and_clicks_on_student(
                        String studentDetails, String sdet, String databaseTesting) {
                EditStudentRecordsImpl.NavigationToRecord(studentDetails, sdet, databaseTesting);
        }

        @Then("the changed information is displayed")
        public void the_changed_information_is_displayed() {
                EditStudentRecordsImpl.verifyChangedInformationIsDisplayed();
        }

        @Then("user deletes {string} records from {string} page, {string} class, {string} section")
        public void user_deletes_records_from_page_class_section(String marleneFishen, String bulkDelete, String sdet,
                        String databaseTesting) {
                EditStudentRecordsImpl.DeleteRecord(marleneFishen, bulkDelete, sdet, databaseTesting);
        }
}
