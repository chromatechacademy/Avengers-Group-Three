package com.chroma.appsCommon;

import com.chroma.pages.BulkDeletePage;
import com.chroma.pages.ClassesAndSectionsPage;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.DisableStudentsPage;
import com.chroma.pages.EditStudentPage;
import com.chroma.pages.LoginPage;
import com.chroma.pages.RealEstateDashboardPage;
import com.chroma.pages.RealEstateLoginPage;
import com.chroma.pages.SamplePage;
import com.chroma.pages.SectionsPage;
import com.chroma.pages.StudentAdmissionPage;
import com.chroma.pages.StudentCategoriesPage;
import com.chroma.pages.StudentDetailsPage;
import com.chroma.stepsImplementation.RealEstateLoginStepImpl;
import com.chroma.stepsImplementation.DisableStudentsStepsImpl;
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
    public static RealEstateLoginPage realEstateLoginPage;
    public static RealEstateDashboardPage realEstateDashboardPage;
    public static DisableStudentsPage disableStudentsPage;

    /* STEPS IMPLEMENTATION INSTANCES */
    public static StudentCategoriesStepImpl studentCategoriesStepImpl;
    public static RealEstateLoginStepImpl realEstateLoginStepImpl;

    /* STEPS IMPLEMENTATION INSTANCES */
    public static EditStudentRecordsImpl editStudentRecordsImpl;
    public static NavigationModulesStepsImpl navigationModulesStepsImpl;
    public static DisableStudentsStepsImpl disableStudentsStepsImpl;

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
        disableStudentsPage = new DisableStudentsPage();
        studentCategoriesStepImpl = new StudentCategoriesStepImpl();
        classesAndSectionsPage = new ClassesAndSectionsPage();
        realEstateLoginPage = new RealEstateLoginPage();
        realEstateLoginStepImpl = new RealEstateLoginStepImpl();
        realEstateDashboardPage = new RealEstateDashboardPage();
        editStudentRecordsImpl = new EditStudentRecordsImpl();
        navigationModulesStepsImpl = new NavigationModulesStepsImpl();
        disableStudentsStepsImpl = new DisableStudentsStepsImpl();
    }
}
