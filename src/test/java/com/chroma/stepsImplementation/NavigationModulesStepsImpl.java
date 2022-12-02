package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;
import com.chroma.web.CommonUtils;

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
                String actualStudentInformationText = DashboardPage.dynamicXpathForModule(studentInformation)
                                .getText();
                CommonUtils.assertEquals(studentInformation, actualStudentInformationText);
                String actualFeesCollectionText = DashboardPage.dynamicXpathForModule(feesCollection)
                                .getText();
                CommonUtils.assertEquals(feesCollection, actualFeesCollectionText);
                String actualIncomeInformarionText = DashboardPage.dynamicXpathForModule(income)
                                .getText();
                CommonUtils.assertEquals(income, actualIncomeInformarionText);
                String actualExpensesInformarionText = DashboardPage.dynamicXpathForModule(expenses)
                                .getText();
                CommonUtils.assertEquals(expenses, actualExpensesInformarionText);
                String actualAcademicsInformarionText = DashboardPage.dynamicXpathForModule(academics)
                                .getText();
                CommonUtils.assertEquals(academics, actualAcademicsInformarionText);
                String actualHumanResourseInformarionText = DashboardPage.dynamicXpathForModule(humanResource)
                                .getText();
                CommonUtils.assertEquals(humanResource, actualHumanResourseInformarionText);
                String actualHomeworkInformarionText = DashboardPage.dynamicXpathForModule(homework)
                                .getText();
                CommonUtils.assertEquals(homework, actualHomeworkInformarionText);
                String actualReportsInformarionText = DashboardPage.dynamicXpathForModule(reports)
                                .getText();
                CommonUtils.assertEquals(reports, actualReportsInformarionText);
        }
}
