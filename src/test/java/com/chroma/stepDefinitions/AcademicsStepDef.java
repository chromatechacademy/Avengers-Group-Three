package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.AcademicsModuleStepsImpl;
import cucumber.api.java.en.Then;

public class AcademicsStepDef extends PageInitializer {

    @Then("user is able to see submodules displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_is_able_to_see_submodules_displayed(String classTimetableLink, String teachersTimetablelink,
            String assignClassTeacherlink, String promoteStudentsLink,
            String subjectGroupLink, String subjectsLink, String classLink, String sectionsLink) {
        AcademicsModuleStepsImpl.AssertAcademicsSubModules(classTimetableLink, teachersTimetablelink,
                assignClassTeacherlink,
                promoteStudentsLink, subjectGroupLink, subjectsLink, classLink, sectionsLink);
    }
}
