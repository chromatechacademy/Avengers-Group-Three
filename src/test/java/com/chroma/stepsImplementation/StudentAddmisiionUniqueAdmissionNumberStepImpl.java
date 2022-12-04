package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class StudentAddmisiionUniqueAdmissionNumberStepImpl extends PageInitializer {
    /**
     * 
     * @param The admissionNoWarning
     */
    public static void AssertAdmissionNo(String admissionNoWarning) {
        String actualAdmissionNoFieldMustContainAUniqueValuetext = studentAdmissionPage.admissionNoWarning.getText();
        CommonUtils.assertEquals(actualAdmissionNoFieldMustContainAUniqueValuetext, admissionNoWarning);
    }
}
