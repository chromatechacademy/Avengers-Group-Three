package com.chroma.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.JavascriptUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StudentInformationModuleStepDef  extends PageInitializer {

    @Given("user is on CTSMS home page {string}")
public void user_is_on_CTSMS_home_page(String url) {
    WebDriverUtils.driver.get(url);

   
}

@When("user clicks on {string}")
public void user_clicks_on(String string) throws InterruptedException {
    JavascriptUtils.clickByJS(WebDriverUtils.driver.findElement(By.xpath("//span[normalize-space()='Student Information']")));
    Thread.sleep(2000);

   // WebDriverUtils.driver.findElement(By.xpath("//span[normalize-space()='Student Information']")).click();
    
}



    
}
