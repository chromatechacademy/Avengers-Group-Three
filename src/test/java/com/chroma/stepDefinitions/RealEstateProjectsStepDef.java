package com.chroma.stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.When;

public class RealEstateProjectsStepDef {

    @When("navigates to {string}, {string} pages displays")
    public void navigates_to_pages_displays(String string, String string2) {
        
    }

    public RealEstateProjectsStepDef() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
