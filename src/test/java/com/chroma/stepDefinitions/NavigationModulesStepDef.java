package com.chroma.stepDefinitions;

import org.openqa.selenium.By;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.LoginPage;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NavigationModulesStepDef extends PageInitializer {

    LoginPage loginPage = new LoginPage();

    @Given("a user is on the CTSMS login page {string}")
    public void a_user_is_on_the_CTSMS_login_page(String url) {
        WebDriverUtils.driver.get(url);

    }

    @When("user logs in with username {string} and password {string}")
    public void user_logs_in_with_username_and_password(String userName, String password) {

       
        loginPage.usernameTextBox.sendKeys(userName);
        loginPage.passwordTextBox.sendKeys(password);
        loginPage.signInBtn.click();

    }

    @Then("user is able to see links displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_is_able_to_see_links_displayed(String studentInformation, String feesCollection, String income,
            String expenses, String academics, String humanResourse, String homework, String reports) {


//span[contains(text(), 'Student Information')]


    }

}
