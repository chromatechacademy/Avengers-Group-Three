package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class DisableStudentsPage {
    
    /* Search button */
    @FindBy(xpath = "(//button[normalize-space()='Search'])[1]")
    public WebElement searchButton;

    /* Disable button */
    @FindBy(xpath = "//a[@class='text-red']")
    public WebElement disableButton;

    /* Xpath for iframe text */
    @FindBy(xpath = "//h4[normalize-space()='Disable Student']")
    public WebElement iframeText;

    /* Reason dropdown */
    @FindBy(xpath = "//select[@name='reason']")
    public WebElement disableDropdown;

    /* Save button */
    @FindBy(xpath = "(//*[contains(text(),'Save')])[3]")
    public WebElement saveButton;

    /* Enable button */
    @FindBy(xpath = "//a[@class='text-green']")
    public WebElement enableButton;

    /**
     * Use this method to dynamically locate the student name
     * Pass name as String argument
     *
     * @param text
     * @return
     */
    public static WebElement dynamicXpathForDisableStudent(String studentName) {
        return WebDriverUtils.driver
                .findElement(By.xpath("//*[contains(text(),'" + studentName + "')]//parent::td//parent::tr/td/a[1]"));
    }

    public DisableStudentsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
