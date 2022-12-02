package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;
import com.chroma.web.CommonUtils;

public class AcademicsModuleStepsImpl extends PageInitializer {
    /**
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
        CommonUtils.assertEquals(classTimetableLink, actualClassTimetable);
        String actualTeachersTimetable = DashboardPage.dynamicXpathForSubModuleWithSpace(teachersTimetablelink)
                .getText();
        CommonUtils.assertEquals(teachersTimetablelink, actualTeachersTimetable);
        String actualAssignClassTeacher = DashboardPage.dynamicXpathForSubModuleWithSpace(assignClassTeacherlink)
                .getText();
        CommonUtils.assertEquals(assignClassTeacherlink, actualAssignClassTeacher);
        String actualPromoteStudentsLink = DashboardPage.dynamicXpathForSubModuleWithSpace(promoteStudentsLink)
                .getText();
        CommonUtils.assertEquals(promoteStudentsLink, actualPromoteStudentsLink);
        String actualSubjectGroupLink = DashboardPage.dynamicXpathForSubModuleWithSpace(subjectGroupLink)
                .getText();
        CommonUtils.assertEquals(subjectGroupLink, actualSubjectGroupLink);
        String actualSubjectsLink = DashboardPage.dynamicXpathForSubModuleWithSpace(subjectsLink)
                .getText();
        CommonUtils.assertEquals(subjectsLink, actualSubjectsLink);
        String actualClassLink = DashboardPage.dynamicXpathForSubModuleWithSpace(classLink)
                .getText();
        CommonUtils.assertEquals(classLink, actualClassLink);
        String actualSectionsLink = DashboardPage.dynamicXpathForSubModuleWithSpace(sectionsLink)
                .getText();
        CommonUtils.assertEquals(sectionsLink, actualSectionsLink);
    }
}
