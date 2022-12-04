package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class BulkDeletePage extends PageInitializer {
    
    /* Locator for Class Dropdown */
    @FindBy(xpath = "//select[@name='class_id']")
    public static WebElement classDropdown;

    /* Locator for Search Button */
    @FindBy(xpath = "//button[normalize-space()='Search']")
    public static WebElement searchButton;
    
    /* Locator for Delete Button */
    @FindBy(xpath = "//button[normalize-space()='Delete']")
    public static WebElement deleteButton;

    /**
     * Use this method locate the checkbox in front of the desired student name
     * @param studentName
     * @return
     */
    public static WebElement dynamicXpathForCheckBoxInBulkDelete(String studentName) {
        return WebDriverUtils.driver
                .findElement(By.xpath("//*[contains(text(),'" + studentName + "')]//parent::td//parent::tr/td/input"));
    }

    public BulkDeletePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
