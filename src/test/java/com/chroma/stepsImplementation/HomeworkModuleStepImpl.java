package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;
import com.chroma.web.CommonUtils;

public class HomeworkModuleStepImpl extends PageInitializer {
    /**
     * 
     * @param homeworkLink
     */
    public static void AssertHomeworkSubModules(String homeworkLink) {
        String actualHomework = DashboardPage.dynamicXpathForSubModule(homeworkLink)
                .getText();
        CommonUtils.assertEquals(actualHomework, homeworkLink);
    }
}
