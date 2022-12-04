package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

public class AcademicsModuleStepsImpl extends PageInitializer {

        /**
         * Use this method to assert academics submodules
         * 
         * @param classTimetableLink
         * @param teachersTimetablelink
         * @param assignClassTeacherlink
         * @param promoteStudentsLink
         * @param subjectGroupLink
         * @param subjectsLink
         * @param classLink
         * @param sectionsLink
         */
        public static void AssertAcademicsSubModules(String classTimetableLink, String teachersTimetablelink,
                        String assignClassTeacherlink, String promoteStudentsLink,
                        String subjectGroupLink, String subjectsLink, String classLink, String sectionsLink) {
                String actualClassTimetable = DashboardPage.dynamicXpathForSubModuleWithSpace(classTimetableLink)
                                .getText();
                CommonUtils.assertEquals(actualClassTimetable, classTimetableLink);
                String actualTeachersTimetable = DashboardPage.dynamicXpathForSubModuleWithSpace(teachersTimetablelink)
                                .getText();
                CommonUtils.assertEquals(actualTeachersTimetable, teachersTimetablelink);
                String actualAssignClassTeacher = DashboardPage
                                .dynamicXpathForSubModuleWithSpace(assignClassTeacherlink)
                                .getText();
                CommonUtils.assertEquals(actualAssignClassTeacher, assignClassTeacherlink);
                String actualPromoteStudentsLink = DashboardPage.dynamicXpathForSubModuleWithSpace(promoteStudentsLink)
                                .getText();
                CommonUtils.assertEquals(actualPromoteStudentsLink, promoteStudentsLink);
                String actualSubjectGroupLink = DashboardPage.dynamicXpathForSubModuleWithSpace(subjectGroupLink)
                                .getText();
                CommonUtils.assertEquals(actualSubjectGroupLink, subjectGroupLink);
                String actualSubjectsLink = DashboardPage.dynamicXpathForSubModuleWithSpace(subjectsLink)
                                .getText();
                CommonUtils.assertEquals(actualSubjectsLink, subjectsLink);
                String actualSectionsLink = DashboardPage.dynamicXpathForSubModuleWithSpace(sectionsLink)
                                .getText();
                CommonUtils.assertEquals(actualSectionsLink, sectionsLink);
                CommonUtils.assertEquals(classLink, dashboardPage.classText.getText());
                CucumberLogUtils.logExtentScreenshot();
                CucumberLogUtils.logScreenShot();
        }
}
