
package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class LoginPage {

    /* Username text box */
    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement usernameTextBox;

    /* Password text box */
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordTextBox;

     /* Invalid username text box */
     @FindBy(xpath = "//input[@placeholder='Username']")
     public WebElement invalidusernameTextBox;
 
     /* Invalid password text box */
     @FindBy(xpath = "//input[@placeholder='Password']")
     public WebElement invalidpasswordTextBox;

    /* Sign in button */
    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    public WebElement signInBtn;

    /* Invalid login message */
    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement invalidLoginMessage;

    public LoginPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}