package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class DashboardPage extends PageInitializer {

    // Chroma Tech Academy dashboard text
    @FindBy(xpath = "//span[normalize-space()='Chroma Tech Academy']")
    public WebElement dashBoardChromaTechText;

    /**
     * Use this method to locate modules
     * 
     * @param module
     * @return
     */

    public static WebElement dynamicXpathForModule(String module) {
        return WebDriverUtils.driver.findElement(By.xpath("//span[contains(text(),'" + module + "')]"));
    }

    /**
     * Use this methode to locate submodules
     * 
     * @param value
     * @return
     */
    public static WebElement dynamicXpathForSubModule(String value) {
        return WebDriverUtils.driver.findElement(By.xpath("//*[contains(text(),'" + " " + value + "')]"));
    }

    public DashboardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
