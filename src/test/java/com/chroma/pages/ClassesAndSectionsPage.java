package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class ClassesAndSectionsPage {

    /* Academics Module */
    @FindBy(xpath = "//span[normalize-space()='Academics']")
    public WebElement academicsText;

    /* Class Submodule */
    @FindBy(xpath = "//a[normalize-space()='Class']")
    public WebElement classText;

    /* Adding Mari Class Text */
    @FindBy(xpath = "//input[@name='class']")
    public WebElement mariClass;

    /* Sample Section */
    @FindBy(xpath = "//input[@value='231']")
    public WebElement sampleSection;

    /* Save Button*/
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    /* Record Saved Successfully Message */
   @FindBy(xpath = "//*[contains(text(),'Record Saved Successfully')]")
    public WebElement recordSavedSuccessfullyMessage;
    
    /* x button for Mari Class record */
    @FindBy(xpath = "//*[contains(text(),'Mari Class')]//following-sibling::td[2]/a[2]")
    public WebElement deleteMariClass;

    public ClassesAndSectionsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
