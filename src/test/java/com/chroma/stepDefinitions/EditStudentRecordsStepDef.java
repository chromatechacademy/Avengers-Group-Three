package com.chroma.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditStudentRecordsStepDef extends PageInitializer {

    @When("clicks on Student Admission under Student Information and creates new student")
    public void clicks_on_Student_Admission_under_Student_Information_and_creates_new_student() {

        WebDriverUtils.driver.findElement(By.xpath("//span[normalize-space()='Student Information']")).click();
        WebDriverUtils.driver.findElement(By.xpath("//*[normalize-space()='Student Admission']")).click();
        WebDriverUtils.driver.findElement(By.xpath("//input[@name='admission_no']")).sendKeys("77777");

        Select classIdDropDown = new Select(driver.findElement(By.xpath("//select[@name='class_id']")));

        classIdDropDown.selectByVisibleText("SDET");

        Select sectionIdDropDown = new Select(driver.findElement(By.xpath("//select[@name='section_id']")));

        sectionIdDropDown.selectByVisibleText("Database Testing");

        WebDriverUtils.driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nataliia");

        Select genderIdDropDown = new Select(driver.findElement(By.xpath("//select[@name='gender']")));

        genderIdDropDown.selectByVisibleText("Female");

        WebDriverUtils.driver.findElement(By.xpath("//input[@name='dob']")).click();
        CommonUtils.sleep(4000);

        WebDriverUtils.driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("05/15/1997");
        WebDriverUtils.driver.findElement(By.xpath("//td[normalize-space()='15']"));
        WebDriverUtils.driver.findElement(By.xpath("//input[@name='email']")).click();

        CommonUtils.scrollIntoView(driver.findElement(By.xpath("//input[@value='mother']")));

        WebDriverUtils.driver.findElement(By.xpath("//input[@value='mother']")).click();

        WebDriverUtils.driver.findElement(By.xpath("//input[@name='guardian_name']")).sendKeys("Elena");
        WebDriverUtils.driver.findElement(By.xpath("//input[@name='guardian_phone']")).sendKeys("12401111111");
        WebDriverUtils.driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Save']")).click();
        CommonUtils.sleep(3000);

    }

    @When("user looks for a studend, edits a record")
    public void user_looks_for_a_studend_edits_a_record() {


        //studenr details

        WebDriverUtils.driver.findElement(By.xpath("(//*[normalize-space()='Student Details'])[3]")).click();

        Select classIdDropDown = new Select(driver.findElement(By.xpath("//select[@name='class_id']")));

        classIdDropDown.selectByVisibleText("SDET");

        Select sectionIdDropDown = new Select(driver.findElement(By.xpath("//select[@name='section_id']")));

        sectionIdDropDown.selectByVisibleText("Database Testing");

        WebDriverUtils.driver.findElement(By.xpath("//button[@value='search_filter']")).click();
        WebDriverUtils.driver.findElement(By.xpath("//tr[@role='row']//a[contains(text(),'Nataliia')]")).click();
        WebDriverUtils.driver.findElement(By.xpath("//a[@title='Edit']")).click();

        Select bloodGroupDropDown = new Select(driver.findElement(By.xpath("//select[@name='blood_group']")));

        bloodGroupDropDown.selectByVisibleText("A+");

        CommonUtils.scrollIntoView(
                WebDriverUtils.driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Save']")));
        WebDriverUtils.driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Save']")).click();
        CommonUtils.sleep(3000);

    }

    @Then("user is able to see links displayed {string}")
    public void user_is_able_to_see_links_displayed(String string) {

        // boolean
        boolean resultsForRecordUpdateSuccessfulyAppears = WebDriverUtils.driver
                .findElement(By.xpath("//div[@student='alert alert-success text-left']")).isDisplayed();
        Assert.assertTrue(resultsForRecordUpdateSuccessfulyAppears);


    }

    @Then("user looks for a studend, clicks on a record")
    public void user_looks_for_a_studend_clicks_on_a_record() {

        Select classIdDropDown = new Select(driver.findElement(By.xpath("//select[@name='class_id']")));

        classIdDropDown.selectByVisibleText("SDET");

        Select sectionIdDropDown = new Select(driver.findElement(By.xpath("//select[@name='section_id']")));

        sectionIdDropDown.selectByVisibleText("Database Testing");

        WebDriverUtils.driver.findElement(By.xpath("//button[@value='search_filter']")).click();

        CommonUtils.sleep(2000);
        WebDriverUtils.driver.findElement(By.xpath("//tr[@role='row']//a[contains(text(),'Nataliia')]")).click();

    }

    @Then("the changed information is displayed")
    public void the_changed_information_is_displayed() {

        CommonUtils.scrollIntoView(WebDriverUtils.driver
                .findElement(By.xpath("//td[normalize-space()='A+']")));
        CommonUtils.sleep(2000);

        // boolean 

        boolean resultsForChangedIngormationAppear = WebDriverUtils.driver
                .findElement(By.xpath("//td[normalize-space()='A+']")).isDisplayed();

        Assert.assertTrue(resultsForChangedIngormationAppear);

        // bulk delete 

        WebDriverUtils.driver.findElement(By.xpath("//a[normalize-space()='Bulk Delete']")).click();

        Select classIdDropDown = new Select(driver.findElement(By.xpath("//select[@name='class_id']")));

        classIdDropDown.selectByVisibleText("SDET");

        Select sectionIdDropDown = new Select(driver.findElement(By.xpath("//select[@name='section_id']")));

        sectionIdDropDown.selectByVisibleText("Database Testing");

        WebDriverUtils.driver.findElement(By.xpath("//button[@value='search_filter']")).click();

        CommonUtils.sleep(2000);

        // parent 

        WebDriverUtils.driver.findElement(By.xpath("//*[contains(text(),'Nataliia')]//parent::td//parent::tr/td[1]"))
                .click();

        CommonUtils.sleep(2000);
        WebDriverUtils.driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();

        CommonUtils.sleep(2000);
        WebDriverUtils.driver.switchTo().alert().accept();

        CommonUtils.sleep(3000);

    }

}