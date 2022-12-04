package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class DashboardRealEstatePage {

    // Dashboard side bar module
    @FindBy(xpath = "//a[@type='button' and @class ='sidebar-item']")
    public WebElement dashboardSideBarModule;

    // Hello Admin text
    @FindBy(xpath = "//h1[normalize-space()='Hello, Admin']")
    public WebElement helloAdminText;

    // Properties text
    @FindBy(xpath = "//h6[normalize-space()='Properties']")
    public WebElement propertiesText;

    /**
     * Use this method to locate tabs display
     * 
     * @param tabsDisplay
     * @return
     */
    public static WebElement dynamicXpathFortabsDisplay(String tabsDisplay) {
        return WebDriverUtils.driver.findElement(By.xpath("//span[contains(text(),'" + tabsDisplay + "')]"));
    }

    /**
     * Use this method to locate module
     * 
     * @param module
     * @return
     */
    public static WebElement dynamicXpathForModule(String module) {
        return WebDriverUtils.driver.findElement(By.xpath("//a[contains(text(),'" + module + "')]"));
    }

    /**
     * Use this method to locate header text on graph displays
     * 
     * @param headerText
     * @return
     */
    public static WebElement dynamicXpathForHeaderTextOnGraphDisplays(String headerText) {
        return WebDriverUtils.driver.findElement(By.xpath("//h5[contains(text(),'" + headerText + "')]"));
    }

    public DashboardRealEstatePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}