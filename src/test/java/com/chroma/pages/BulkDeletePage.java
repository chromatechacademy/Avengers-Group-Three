package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class BulkDeletePage extends PageInitializer {
    @FindBy(xpath = "//select[@name='class_id']")
    public static WebElement classDropdown;

    @FindBy(xpath = "//button[normalize-space()='Search']")
    public static WebElement searchButton;

    @FindBy(xpath = "//button[normalize-space()='Delete']")
    public static WebElement deleteButton;
    
    /**
     * 
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
