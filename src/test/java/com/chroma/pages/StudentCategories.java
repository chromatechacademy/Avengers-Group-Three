package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class StudentCategories {

    /* Category text box */
    @FindBy(xpath = "//input[@name='category']")
    public WebElement categoryTextBox;

    /* Save Button */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement categorySaveButton;

    /**
     * Use this method to locate a category by text
     * @param text
     * @return
     */
    public static WebElement dynamixCategoryText(String text) {
        return WebDriverUtils.driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]"));
    }

    /**
     * Use this method to dynamically locate the x button of desired category
     * Pass name of category as String argument
     * @param text
     * @return
     */
    public static WebElement dynamixCategoryLocatorXButton(String text) {
        return WebDriverUtils.driver
                .findElement(By.xpath("//*[contains(text(),'" + text + "')]//following-sibling::td[2]/a[2]"));
    }

    public StudentCategories() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
