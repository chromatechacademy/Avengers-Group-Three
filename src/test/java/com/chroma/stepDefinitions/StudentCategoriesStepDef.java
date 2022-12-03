package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentCategoriesStepDef extends PageInitializer {

    @When("enters Student Category {string}")
    public void enters_Student_Category(String category) {
       studentCategoriesStepImpl.enteringAndSavingStudentCategory(category);
    }

    @When("verifies that Category {string} is displayed")
    public void verifies_that_Category_is_displayed(String expectedCategory) {
        studentCategoriesStepImpl.verifyingStudentCategoryIsDisplayed(expectedCategory);
    }

    @Then("Category {string} is deleted")
    public void category_is_deleted(String category) {
        studentCategoriesStepImpl.deletingStudentCategory(category);
    }
}
