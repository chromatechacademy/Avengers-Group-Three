package com.chroma.appsCommon;

import com.chroma.pages.BulkDeletePage;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.LoginPage;
import com.chroma.pages.SamplePage;
import com.chroma.pages.SectionsPage;
import com.chroma.pages.StudentAdmissionPage;
import com.chroma.pages.StudentCategories;
import com.chroma.pages.StudentDetailsPage;
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
    public static SectionsPage sectionsPage;
    public static StudentCategories studentCategories;

    /* STEPS IMPLEMENTATION INSTANCES */
    public static StudentCategoriesStepImpl studentCategoriesStepImpl;

    public void initializeAllPages() {
        samplePage = new SamplePage();
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        studentAdmissionPage = new StudentAdmissionPage();
        bulkDeletePage = new BulkDeletePage();
        studentDetailsPage = new StudentDetailsPage();
        sectionsPage = new SectionsPage();
        studentCategories = new StudentCategories();
        studentCategoriesStepImpl = new StudentCategoriesStepImpl();
    }
}
