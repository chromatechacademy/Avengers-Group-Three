package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;
import com.chroma.web.CommonUtils;

public class NavigationModulesStepsImpl extends PageInitializer {
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
                CommonUtils.assertEquals(actualStudentInformationText, studentInformation);
                String actualFeesCollectionText = DashboardPage.dynamicXpathForModule(feesCollection)
                                .getText();
                CommonUtils.assertEquals(actualFeesCollectionText, feesCollection);
                String actualIncomeInformarionText = DashboardPage.dynamicXpathForModule(income)
                                .getText();
                CommonUtils.assertEquals(actualIncomeInformarionText, income);
                String actualExpensesInformarionText = DashboardPage.dynamicXpathForModule(expenses)
                                .getText();
                CommonUtils.assertEquals(actualExpensesInformarionText, expenses);
                String actualAcademicsInformarionText = DashboardPage.dynamicXpathForModule(academics)
                                .getText();
                CommonUtils.assertEquals(actualAcademicsInformarionText, academics);
                String actualHumanResourseInformarionText = DashboardPage.dynamicXpathForModule(humanResource)
                                .getText();
                CommonUtils.assertEquals(actualHumanResourseInformarionText, humanResource);
                String actualHomeworkInformarionText = DashboardPage.dynamicXpathForModule(homework)
                                .getText();
                CommonUtils.assertEquals(actualHomeworkInformarionText, homework);
                String actualReportsInformarionText = DashboardPage.dynamicXpathForModule(reports)
                                .getText();
                CommonUtils.assertEquals(actualReportsInformarionText, reports);
        }
}
