package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;

import org.testng.Assert;

public class NavigationModulesStepsImpl extends PageInitializer {
    // Add step implementation methods in this class
    // NOTE: Every step implementation class Extends PageInitializer{

    /**
     * Method for Assert Navigation Modules
     * 
     * @param studentInformation
     * @param feesCollection
     * @param income
     * @param expenses
     * @param academics
     * @param humanResource
     * @param homework
     * @param reports
     */
    public static void AssertNavigationModules(String studentInformation, String feesCollection, String income,
            String expenses, String academics, String humanResource, String homework, String reports) {

        boolean isStudentInformarionDisplayed = DashboardPage.dynamicXpathForModule(studentInformation)
                .getText().contentEquals(studentInformation);

        Assert.assertTrue(isStudentInformarionDisplayed);

        boolean isFeesCollectionInformarionDisplayed = DashboardPage.dynamicXpathForModule(feesCollection)
                .getText().contentEquals(feesCollection);

        Assert.assertTrue(isFeesCollectionInformarionDisplayed);

        boolean isIncomeInformarionDisplayed = DashboardPage.dynamicXpathForModule(income)
                .getText().contentEquals(income);

        Assert.assertTrue(isIncomeInformarionDisplayed);

        boolean isExpensesInformarionDisplayed = DashboardPage.dynamicXpathForModule(expenses)
                .getText().contentEquals(expenses);

        Assert.assertTrue(isExpensesInformarionDisplayed);

        boolean isAcademicsInformarionDisplayed = DashboardPage.dynamicXpathForModule(academics)
                .getText().contentEquals(academics);

        Assert.assertTrue(isAcademicsInformarionDisplayed);

        boolean isHumanResourseInformarionDisplayed = DashboardPage.dynamicXpathForModule(humanResource)
                .getText().contentEquals(humanResource);

        Assert.assertTrue(isHumanResourseInformarionDisplayed);

        boolean isHomeworkInformarionDisplayed = DashboardPage.dynamicXpathForModule(homework)
                .getText().contentEquals(homework);

        Assert.assertTrue(isHomeworkInformarionDisplayed);

        boolean isReportsInformarionDisplayed = DashboardPage.dynamicXpathForModule(reports)
                .getText().contentEquals(reports);

        Assert.assertTrue(isReportsInformarionDisplayed);

    }

}
