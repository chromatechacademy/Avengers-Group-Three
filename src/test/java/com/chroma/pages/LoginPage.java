
package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class LoginPage {

    // username text box
    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement usernameTextBox;

    // password text box
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordTextBox;

     // username text box
     @FindBy(xpath = "//input[@placeholder='Username']")
     public WebElement invalidusernameTextBox;
 
     // password text box
     @FindBy(xpath = "//input[@placeholder='Password']")
     public WebElement invalidpasswordTextBox;

    // sign in button
    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    public WebElement signInBtn;

    // invalid login message
    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement invalidLoginMessage;

    public LoginPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}