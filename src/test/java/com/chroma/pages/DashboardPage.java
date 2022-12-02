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

    // Student Information Module Btn
    @FindBy(xpath = "//i[@class = 'fa fa-user-plus ftlayer']")
    public WebElement studentInfoBtn;

    // Class Btn
    @FindBy(xpath = "//a[normalize-space()='Class']")
    public WebElement classText;

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
<<<<<<< HEAD
        return WebDriverUtils.driver.findElement(By.xpath("//*[contains(text(),'" + " " + value + "')]"));

=======
        return WebDriverUtils.driver.findElement(By.xpath("//*[contains(text(),'" + value + "')]"));
>>>>>>> 00cebf54dce29efc554bc5518a74713a6e357bb1
    }

    /**
     * Use this methode to locate submodules with space in the front
     * 
     * @param value
     * @return
     */
    public static WebElement dynamicXpathForSubModuleWithSpace(String value) {
        return WebDriverUtils.driver.findElement(By.xpath("//*[contains(text(),'" + " " + value + "')]"));
    }
    
    public DashboardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    
    }
}
