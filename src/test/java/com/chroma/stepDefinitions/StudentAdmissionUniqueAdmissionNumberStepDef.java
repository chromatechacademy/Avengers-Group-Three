package com.chroma.stepDefinitions;

import com.chroma.stepsImplementation.StudentAddmisiionUniqueAdmissionNumberStepImpl;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;

public class StudentAdmissionUniqueAdmissionNumberStepDef {

    @Then("{string} is displayed")
    public void is_displayed(String TheAdmissionNoFieldMustContainAUniqueValue) {
        StudentAddmisiionUniqueAdmissionNumberStepImpl.AssertAdmissionNo(TheAdmissionNoFieldMustContainAUniqueValue);
        CommonUtils.sleep(3000);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}
