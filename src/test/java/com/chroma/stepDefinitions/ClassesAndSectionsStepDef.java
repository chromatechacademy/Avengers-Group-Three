package com.chroma.stepDefinitions;

import com.chroma.pages.DashboardPage;
import com.chroma.web.CommonUtils;

import cucumber.api.java.en.When;

public class ClassesAndSectionsStepDef {

    @When("navigates to {string} module")
    public void navigates_to_module(String module) {
        DashboardPage.dynamicXpathForModule(module).click();
        CommonUtils.sleep(2000);
    }

    //@When("navigates to {string} submodule")
    //public void navigates_to_submodule(String subModule) {
      //  DashboardPage.dynamicXpathForSubModule(subModule).click();

      @When("navigates to {string} classSubModule")
      public void navigates_toclass_module(String classText) {
          DashboardPage.classText(classText).click();

        


        CommonUtils.sleep(2000);

    }

}
