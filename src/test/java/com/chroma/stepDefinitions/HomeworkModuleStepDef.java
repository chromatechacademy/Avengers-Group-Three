package com.chroma.stepDefinitions;

import com.chroma.stepsImplementation.HomeworkModuleStepImpl;
import com.chroma.utils.CucumberLogUtils;
import cucumber.api.java.en.Then;

public class HomeworkModuleStepDef {

    @Then("folowing link is displayed {string}")
public void folowing_link_is_displayed(String addHomeworkLink) {
   HomeworkModuleStepImpl.AssertHomeworkSubModules(addHomeworkLink);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}
    
//public class AcademicsStepDef extends PageInitializer {

    ///@Then("user is able to see submodules displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    //public void user_is_able_to_see_submodules_displayed(String classTimetableLink, String teachersTimetablelink,
           /// String assignClassTeacherlink, String promoteStudentsLink,
           // String subjectGroupLink, String subjectsLink, String classLink, String sectionsLink)}
           
           //  
                //AcademicsModuleStepsImpl.AssertAcademicsSubModules(classTimetableLink, teachersTimetablelink, assignClassTeacherlink, 
                //promoteStudentsLink, subjectGroupLink, subjectsLink, classLink, sectionsLink);
    //}