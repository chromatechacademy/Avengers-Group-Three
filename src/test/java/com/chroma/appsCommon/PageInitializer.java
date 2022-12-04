package com.chroma.appsCommon;

import com.chroma.pages.BulkDeletePage;
import com.chroma.pages.ClassesAndSectionsPage;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.EditStudentPage;
import com.chroma.pages.LoginPage;
import com.chroma.pages.SamplePage;
import com.chroma.pages.SectionsPage;
import com.chroma.pages.StudentAdmissionPage;
import com.chroma.pages.StudentCategoriesPage;
import com.chroma.pages.StudentDetailsPage;
import com.chroma.pages.ValidateAgentModulePage;
import com.chroma.stepsImplementation.EditStudentRecordsImpl;
import com.chroma.stepsImplementation.NavigationModulesStepsImpl;
import com.chroma.stepsImplementation.StudentCategoriesStepImpl;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {

    /* PAGE INSTANCES */
    public static SamplePage samplePage;
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static StudentAdmissionPage studentAdmissionPage;
    public static BulkDeletePage bulkDeletePage;
    public static StudentDetailsPage studentDetailsPage;
    public static EditStudentPage editStudentPage;
    public static SectionsPage sectionsPage;
    public static StudentCategoriesPage studentCategories;
    public static ClassesAndSectionsPage classesAndSectionsPage;
    public static ValidateAgentModulePage validateAgentModulePage;

    /* STEPS IMPLEMENTATION INSTANCES */
    public static StudentCategoriesStepImpl studentCategoriesStepImpl;
    public static EditStudentRecordsImpl editStudentRecordsImpl;
    public static NavigationModulesStepsImpl navigationModulesStepsImpl;

    public void initializeAllPages() {
        samplePage = new SamplePage();
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        studentAdmissionPage = new StudentAdmissionPage();
        bulkDeletePage = new BulkDeletePage();
        studentDetailsPage = new StudentDetailsPage();
        editStudentPage = new EditStudentPage();
        sectionsPage = new SectionsPage();
        studentCategories = new StudentCategoriesPage();
        studentCategoriesStepImpl = new StudentCategoriesStepImpl();
        classesAndSectionsPage = new ClassesAndSectionsPage();
        editStudentRecordsImpl = new EditStudentRecordsImpl();
        navigationModulesStepsImpl = new NavigationModulesStepsImpl();
        validateAgentModulePage = new ValidateAgentModulePage();
    }
}
