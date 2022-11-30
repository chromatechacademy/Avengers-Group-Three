package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class LoginPage extends PageInitializer{
    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement usernameTextBox;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordTextBox;
    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    public WebElement signInBtn;
    public LoginPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
