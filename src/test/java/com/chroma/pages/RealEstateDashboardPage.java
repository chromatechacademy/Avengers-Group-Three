package com.chroma.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateDashboardPage {

    /* Hello Admin Text */
    @FindBy(xpath = "//h1[@class='mainUserText']")    
    public WebElement dashboardHelloAdminText;

    /* Dashboard side bar module */
    @FindBy(xpath = "//a[@type='button']")
    public WebElement dashboardSideBarModule;

    /* Properties text */
    @FindBy(xpath = "//h6[normalize-space()='Properties']")
    public WebElement propertiesText;
   
    /* Tabs options */
    @FindBy(xpath = " //span[@class='navbar-label']")
    public List<WebElement> tabsOptions;

     /* Agents Graph model */
     @FindBy(xpath = " //a[normalize-space()='Agents Graph']")
     public WebElement AgentGraphModel;
   
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

    public RealEstateDashboardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
