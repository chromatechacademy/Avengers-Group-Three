package com.chroma.stepDefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddAndDeleteSectionsStepDef extends PageInitializer {

    @When("user clicks on {string} and {string}")
    public void user_clicks_on_and(String academics, String sections) {
        WebDriverUtils.driver.findElement(By.xpath("//i[@class='fa fa-mortar-board ftlayer']")).click();
        WebDriverUtils.driver.findElement(By.xpath("//a[normalize-space()='Sections']")).click();
    }

    @When("user enters {string} in the Section name and click on Save")
    public void user_enters_in_the_Section_name_and_click_on_Save(String string) {
        WebDriverUtils.driver.findElement(By.xpath("//input[@id='section']")).sendKeys("Testing for everyone");
        WebDriverUtils.driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Save']")).click();
    }

    @When("Record Saved Successfully and  Testing for everyone appeared in the Section List")
    public void record_Saved_Successfully_and_Testing_for_everyone_appeared_in_the_Section_List() {
        boolean recordSavedBtn = WebDriverUtils.driver
                .findElement(By.xpath("//div[@class='alert alert-success text-left']")).isDisplayed();
        Assert.assertTrue(recordSavedBtn);

        boolean testForEveryOneBtn = WebDriverUtils.driver
                .findElement(By.xpath(
                        "//tr[@class='even']//td[@class='mailbox-name'][normalize-space()='Testing for everyone']"))
                .isDisplayed();
        Assert.assertTrue(testForEveryOneBtn);
        CommonUtils.sleep(3000);

        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

        // CommonUtils.assertEquals(disabledStudents, actualDisableStudents);
    }

    @Then("user clicks on delete and deleted Testing for everyone from the Section List")
    public void user_clicks_on_delete_and_deleted_Testing_for_everyone_from_the_Section_List() {

        WebDriverUtils.driver.findElement(By.xpath("//i[@class='fa fa-remove']")).click();
        CommonUtils.acceptAlert();
        CommonUtils.sleep(3000);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
