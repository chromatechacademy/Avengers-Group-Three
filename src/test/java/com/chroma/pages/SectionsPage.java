package com.chroma.pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class SectionsPage extends PageInitializer {

    /* Academics Btn */
    @FindBy(xpath = "//i[@class='fa fa-mortar-board ftlayer']")
    public WebElement academicsBtn;

    /* Section Btn */
    @FindBy(xpath = "//a[normalize-space()='Sections']")
    public WebElement sectionBtn;

    /* Enter text */
    @FindBy(xpath = "//input[@id='section']")
    public WebElement text;

    /* Save Btn */
    @FindBy(xpath = "(//button[@type ='submit'])[3]")
    public WebElement saveBtn;

    /* Delete Btn */
    @FindBy(xpath = "//*[contains(text(), 'Testing for everyone')]/following-sibling::td/a[2]")
    public WebElement deleteBtn;

    /* Success sign */
    @FindBy(xpath = "//div[@class='alert alert-success text-left']")
    public WebElement successSign;

    /* Added section */
    @FindBy(xpath = "//*[contains(text(), 'Testing for everyone')]")
    public WebElement addedSection;

    /* Deleted section from the List of WebElements */
    @FindBy(xpath = "//*[@class ='mailbox-name']")
    public List<WebElement> subject;

    public SectionsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
